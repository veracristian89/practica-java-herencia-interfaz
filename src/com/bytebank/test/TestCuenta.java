package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestCuenta {

	public static void main(String[] args) {
		CuentaCorriente cc = null;
		CuentaAhorro ca = new CuentaAhorro(2, 3);
		cc.depositar(2000);
		cc.transferir(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
	
}
