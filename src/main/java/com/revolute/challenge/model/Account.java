package com.revolute.challenge.model;

public class Account {
	private double balance = 0;

	public double balance() {
		return balance;
	}

	public double debit(double amountToDebit) {
		return balance -= amountToDebit;
	}

	public double credit(double amountToCredit) {
		return balance += amountToCredit;
	}
}
