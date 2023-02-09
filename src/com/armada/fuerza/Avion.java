package com.armada.fuerza;

public class Avion extends Vehiculo implements Volador {
	private Double altura;
	
	public Avion(int codigo, String nombre) {
		super(codigo, nombre);
		this.altura=0.0;
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}
}
