package com.bytebank.test;

public class TesWrappers {

	public static void main(String[] args) {
		
		Double numeroDouble = 33.0; // autoboxing
		Boolean verdadero = true; //autoboxing
		
		Double numeroDouble2 = Double.valueOf(33);
		System.out.println(numeroDouble2);
		
		String numeroString = "43";
		Double stringToDouble = Double.valueOf(numeroString);//unboxing
	}
	
}
