package com.revolute.challenge.datastore;

import com.revolute.challenge.model.Account;

public interface Ledger {

	Account lookup(long accountId);
}
