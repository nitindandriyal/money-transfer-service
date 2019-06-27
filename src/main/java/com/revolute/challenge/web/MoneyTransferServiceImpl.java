package com.revolute.challenge.web;

import javax.jws.WebService;

@WebService(endpointInterface = "com.revolute.challenge.web.MoneyTransferService")
public class MoneyTransferServiceImpl implements MoneyTransferService {

	@Override
	public boolean transfer(long fromAccountId, long toAccountId) {
		return false;
	}

}
