package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
		//referencia		objeto
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		
		lista.add(cc);
		lista.add(cc2);
		
		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);
		
		//for (int i = 0; i< lista.size(); i++) {
			//System.out.println("este es el elemento Nro " + i +": cuenta "+ lista.get(i));
		//}
		
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}					
		System.out.println("es igual con equals? "+lista.contains(cc3));
	
	}
	
}
