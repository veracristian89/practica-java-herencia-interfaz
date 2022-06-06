package com.bytebank.modelo;

//una clase abstracta no puede ser instanciada, es una clase generica de la que van a heredar sus hijos
public abstract class Funcionario {

	private String nombre;
	private String documento;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
			// metodo abstracto sin cuerpo
	public abstract double getBonificacion();
	
}
