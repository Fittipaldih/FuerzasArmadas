package com.armada.fuerza;

public class Tanque extends Vehiculo implements Terrestre {
	private Double velocidad;
	
	public Tanque(int codigo, String nombre) {
		super(codigo, nombre);
		this.velocidad=0.0;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

}
