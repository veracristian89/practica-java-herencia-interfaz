package com.bytebank.modelo;

public class GuardaReferencias {
	
	Object[] referencia = new Object[10];
	int indice = 0;
	
	public void adicionar(Object objeto) {
		referencia[indice] = objeto;
		indice++;	
	}
	public Object obtener(int indice) {
		return referencia[indice];	
	}
	
}
