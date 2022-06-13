package com.bytebank.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorro;
import com.bytebank.modelo.CuentaCorriente;

public class TestOrdernarLista {

	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(22, 33);
		Cliente clientecc1 = new Cliente();
		clientecc1.setNombre("Diego");
		cc1.setTitular(clientecc1);
		cc1.depositar(333.0);
		
		Cuenta cc2 = new CuentaAhorro(22, 44);
		Cliente clientecc2 = new Cliente();
		clientecc2.setNombre("Renato");
		cc2.setTitular(clientecc2);
		cc2.depositar(444.0);
		
		Cuenta cc3 = new CuentaCorriente(22, 11);
		Cliente clientecc3 = new Cliente();
		clientecc3.setNombre("Liam");
		cc3.setTitular(clientecc3);
		cc3.depositar(111.0);
		
		Cuenta cc4 = new CuentaAhorro(22, 22);
		Cliente clientecc4 = new Cliente();
		clientecc4.setNombre("Noel");
		cc4.setTitular(clientecc4);
		cc4.depositar(222.0);
		
		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println("antes de ordenar");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		// Ordenar las cuentas
		//				cualquier clase hija de Cuenta o Cuenta en si.
		// Comparater <? extends Cuenta> c
		Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		lista.sort(comparator);
		
		System.out.println("despues de ordenar");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
	}
	
}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		if(o1.getNumero()==o2.getNumero()) {
			return 0;
		} else if (o1.getNumero()>o2.getNumero()) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
