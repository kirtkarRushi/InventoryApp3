package com.cjc.exception_rest.exception;

public class StudentNotFound extends RuntimeException {

	public StudentNotFound(String massage)
	{
		super(massage);
	}
}
