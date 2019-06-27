package com.revolute.challenge;

import javax.xml.ws.Endpoint;

import com.revolute.challenge.web.MoneyTransferService;
import com.revolute.challenge.web.MoneyTransferServiceImpl;

public class Main {
		public static void main(String[] args) {
			MoneyTransferService atmServiceImpl = new MoneyTransferServiceImpl();
			Endpoint.publish("http://localhost:9999/ws/atm", atmServiceImpl);
		}
}
