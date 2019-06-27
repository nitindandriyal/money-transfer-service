package com.revolute.challenge.web;

import javax.jws.WebService;

import com.revolute.challenge.datastore.Ledger;
import com.revolute.challenge.datastore.LedgerImpl;
import com.revolute.challenge.exceptions.InsufficientFundsException;
import com.revolute.challenge.exceptions.InvalidAccountException;
import com.revolute.challenge.model.Account;

@WebService(endpointInterface = "com.revolute.challenge.web.MoneyTransferService")
public class MoneyTransferServiceImpl implements MoneyTransferService {

	private final Object tieLock = new Object();

	private final Ledger ledger = new LedgerImpl();

	@Override
	public boolean transfer(long fromAccountId, long toAccountId, double amount)
			throws InsufficientFundsException, InvalidAccountException {
		Account fromAccount = ledger.lookup(fromAccountId);
		Account toAccount = ledger.lookup(toAccountId);
		int fromHash = System.identityHashCode(fromAccount);
		int toHash = System.identityHashCode(toAccount);
		if (fromHash < toHash) {
			synchronized (fromAccount) {
				synchronized (toAccount) {
					transfer(fromAccount, toAccount, amount);
				}
			}
		}
		else if (fromHash > toHash) {
			synchronized (toAccount) {
				synchronized (fromAccount) {
					transfer(fromAccount, toAccount, amount);
				}
			}
		}
		else {
			synchronized (tieLock) {
				synchronized (fromAccount) {
					synchronized (toAccount) {
						transfer(fromAccount, toAccount, amount);
					}
				}
			}
		}
		return false;
	}

	public void transfer(Account fromAccount, Account toAccount, double amount) throws InsufficientFundsException {
		if (fromAccount.balance() < amount)
			throw new InsufficientFundsException("Not enough funds for transfer");
		else {
			fromAccount.debit(amount);
			toAccount.credit(amount);
		}
	}
}