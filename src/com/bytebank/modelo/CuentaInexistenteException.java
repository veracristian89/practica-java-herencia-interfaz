package com.bytebank.modelo;

public class CuentaInexistenteException extends Exception{
	
	public CuentaInexistenteException(String mensaje) {
		
		super(mensaje);
		
	}
		
}
