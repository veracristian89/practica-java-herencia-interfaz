package com.bytebank.modelo;

public class GuardaCuentas {

	//crear objeto para guardar muchas cuentas
	//permitir agregar cuentas con un metodo
	//guardaCuentas.adiciona(cuenta);
	//obtener, remover, etc.
	
	Cuenta[] cuenta = new Cuenta[10];

	public void adicionar(Cuenta cc) {
		cuenta[0]=cc;
	} 
	public Cuenta obtener(int indice) {
		return cuenta[indice];
	} 
}
