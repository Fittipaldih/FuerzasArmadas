package com.armada.fuerza;

public class Submarino extends Vehiculo implements Acuatico {
	private Double profundidad;
	
	public Submarino(int codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

}
