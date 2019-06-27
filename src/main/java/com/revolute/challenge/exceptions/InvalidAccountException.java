package com.revolute.challenge.exceptions;

public class InvalidAccountException extends RuntimeException {

	private static final long serialVersionUID = -1L;

	/**
	 * @param message
	 */
	public InvalidAccountException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public InvalidAccountException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidAccountException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public InvalidAccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}