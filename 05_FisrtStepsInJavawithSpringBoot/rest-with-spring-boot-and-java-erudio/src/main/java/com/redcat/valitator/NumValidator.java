package com.redcat.valitator;

public class NumValidator {
	
	private String strNumber;
	
	public static Double convertToDouble(String strNumber) {
		if (strNumber == null) return 0D;
		
		//BR 0,25 to US 0.25
		String number = strNumber.replaceFirst(",", ".");
		if (isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null) return false;
		String number = strNumber.replaceFirst(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

}
