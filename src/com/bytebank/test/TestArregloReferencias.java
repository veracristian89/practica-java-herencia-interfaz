package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorro;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {

	public static void main(String[] args) {
		Object[] referencias = new Object[5];

		CuentaCorriente cc = new CuentaCorriente(23, 44);
		CuentaAhorro ca = new CuentaAhorro(24, 45);
		
		referencias[1] = cc;
		referencias[3] = ca;
		Cliente cliente = new Cliente();
		referencias[4] = cliente;
		
								//cast, se fuerza el tipo de cuenta a cuenta corriente.
		CuentaCorriente cuenta= (CuentaCorriente)referencias[1];
		System.out.println("esta es mi cuenta "+cuenta);
		
		for (int i = 0; i< referencias.length; i++) {
			System.out.println(referencias[i]);
		}
		
	}
	
}
