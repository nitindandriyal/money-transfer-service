package com.revolute.challenge.exceptions;

public class InsufficientFundsException extends RuntimeException {

	private static final long serialVersionUID = -1L;

	/**
	 * @param message
	 */
	public InsufficientFundsException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public InsufficientFundsException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InsufficientFundsException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public InsufficientFundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}