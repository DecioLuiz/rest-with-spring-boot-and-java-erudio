package com.redcat.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redcat.entity.Calculator;
import com.redcat.exceptions.UnsupportedMathOperationException;
import com.redcat.valitator.NumValidator;

@RestController
public class MathController {
	
	private static AtomicLong counter = new AtomicLong();
	
	private Calculator calc = new Calculator();
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value= "numberOne") String numberOne, 
			@PathVariable(value= "numberTwo") String numberTwo) throws Exception {
		
		if(!NumValidator.isNumeric(numberOne) || !NumValidator.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return calc.sum(NumValidator.convertToDouble(numberOne), NumValidator.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double subtraction(
			@PathVariable(value= "numberOne") String numberOne, 
			@PathVariable(value= "numberTwo") String numberTwo) throws Exception {
		
		if(!NumValidator.isNumeric(numberOne) || !NumValidator.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return calc.subtraction(NumValidator.convertToDouble(numberOne), NumValidator.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiplication(
			@PathVariable(value= "numberOne") String numberOne, 
			@PathVariable(value= "numberTwo") String numberTwo) throws Exception {
		
		if(!NumValidator.isNumeric(numberOne) || !NumValidator.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return calc.multiplication(NumValidator.convertToDouble(numberOne), NumValidator.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/division/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double division(
			@PathVariable(value= "numberOne") String numberOne, 
			@PathVariable(value= "numberTwo") String numberTwo) throws Exception {
		
		if(!NumValidator.isNumeric(numberOne) || !NumValidator.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		if(NumValidator.convertToDouble(numberTwo) == 0) {
			throw new UnsupportedMathOperationException("Number can't be divided by zero");
		}
		return calc.division(NumValidator.convertToDouble(numberOne), NumValidator.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/media/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double media(
			@PathVariable(value= "numberOne") String numberOne, 
			@PathVariable(value= "numberTwo") String numberTwo) throws Exception {
		
		if(!NumValidator.isNumeric(numberOne) || !NumValidator.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}

		return calc.media(NumValidator.convertToDouble(numberOne), NumValidator.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/sqrt/{number}", method=RequestMethod.GET)
	public Double sqrt(@PathVariable(value= "number") String number) throws Exception {
		
		if(!NumValidator.isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		
		return calc.sqrt(NumValidator.convertToDouble(number));
	}
}
