package com.redcat.entity;

public class Calculator {	

	public Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}
	
	public Double subtraction(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}
	
	public Double multiplication(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}
	
	public Double division(Double numberOne, Double numberTwo) {
		return numberOne / numberTwo;
	}
	
	public Double media(Double numberOne, Double numberTwo) {
		return (numberOne + numberTwo) / 2;
	}
	
	public Double sqrt(Double number) {
		return Math.sqrt(number);
	}
}
