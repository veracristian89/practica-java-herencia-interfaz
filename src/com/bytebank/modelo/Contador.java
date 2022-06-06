package com.bytebank.modelo;

public class Contador extends Funcionario {
	
	@Override
	public double getBonificacion() {
		System.out.println("ejecutando desde contador");
		return 200;
	}

}
