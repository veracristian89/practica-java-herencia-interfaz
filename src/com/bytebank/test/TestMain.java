package com.bytebank.test;

public class TestMain {

	public static void main(String[] args) {
		
		int edad = 20;
		int edad2 = 15;
		int edad3 = 67;
		
		//como agrupar en un a sola referencia? 
						// se asigna el tamaño del array
						// 0 1 2 3 4
						//[ | | | | ]
		int[] edades = new int[5];
		
		edades[2] = 30;
		
		System.out.println(edades[1]);
		System.out.println("la longitud el array es: " + edades.length);
	}
	
}
