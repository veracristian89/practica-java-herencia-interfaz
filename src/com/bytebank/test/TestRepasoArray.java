package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {

	public static void main(String[] args) {
		//tipo de array--------tamaño del array
		int[] numeros = new int[10];
		int numero = 40;
		Integer numeroObjeto = Integer.valueOf(60);
		
		//(en el generic pones el tipo de objeto, puede ser un objeto tipo Cuenta o tipo Cliente por ej.
		//lista <generic>--------ArrayList LinkedList Vector
		List<Object> lista = new ArrayList<Object>();
		lista.add(numero); // autoboxin (convierte un primitivo a un objeto)
		lista.add(Integer.valueOf(50));// se guarda un objeto que retorna un int
		lista.add(numeroObjeto);
		
		//unboxing
		//int valorPrimitivo = numeroObjeto;
		int valorPrimitivo = numeroObjeto.intValue();
		
		
	}
	
}
