package com.revolute.challenge.web;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface MoneyTransferService {

	@WebMethod
	boolean transfer(long fromAccountId, long toAccountId);

}
