package com.armada.fuerza;

public class Destructor extends Vehiculo implements Acuatico{
	private Double profundidad;
	
	public Destructor(int codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

}
