package com.cisco.session3.customexc;

public class InvalidEmailException extends Exception{

	public InvalidEmailException(String message) {
		super(message);
	}
	
}
