package com.bytebank.test;

import com.bytebank.modelo.*;


public class TestReferencias {

	public static void main(String[] args) {
		Funcionario funcionario = new Contador();
		funcionario.setNombre("roberto gomez bola?os");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("dr chapatin");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
	}
	
}
