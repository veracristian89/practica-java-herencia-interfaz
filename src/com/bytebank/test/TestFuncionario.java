package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario cristianFuncionario = new Contador();
		cristianFuncionario.setSalario(2000);
		System.out.println(cristianFuncionario.getSalario());
		System.out.println(cristianFuncionario.getBonificacion());
	}
	
}
