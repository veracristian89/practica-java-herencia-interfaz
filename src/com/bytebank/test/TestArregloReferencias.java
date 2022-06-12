package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorro;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {

	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(23, 44);
		CuentaAhorro ca = new CuentaAhorro(24, 45);
		
		Cuenta[] cuentas = new Cuenta[5];
		cuentas[1] = cc;
		cuentas[3] = ca;
								//cast, se fuerza el tipo de cuenta a cuenta corriente.
		CuentaCorriente cuenta= (CuentaCorriente)cuentas[1];
		System.out.println("esta es mi cuenta "+cuenta);
		
		for (int i = 0; i< cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
		
	}
	
}
