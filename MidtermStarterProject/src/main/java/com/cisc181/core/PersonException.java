package com.cisc181.core;

public class PersonException extends Exception{
	
	Person person;
	
	public PersonException(Person person){
		this.person = person;
		System.out.println("error");
	}
	
}
