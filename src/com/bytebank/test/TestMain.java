package com.bytebank.test;

public class TestMain {

	public static void main(String[] args) {
		
		System.out.println("la longitud el array es: " + args.length);
		for (int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		int edad = 20;
		int edad2 = 15;
		int edad3 = 67;
		
		//como agrupar en un a sola referencia? 
						// se asigna el tamanio del array
						// 0 1  2 3 4
						//[ | |30| | ]
		int[] edades = new int[5];
		edades[0] = edad;
		edades[1] = edad2;
		edades[3] = edad3;
		edades[2] = 30;
		
		System.out.println("la longitud el array es: " + edades.length);
		for (int i=0; i<edades.length; i++) {
			System.out.println(edades[i]);
		}
	}
	
}
