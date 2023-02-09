package com.armada.fuerza.vehiculos;

import com.armada.fuerza.Vehiculo;
import com.armada.fuerza.interfaces.Anfibio;

public class VehiculoAnfibio extends Vehiculo implements Anfibio {

	private Double profundidad;
	private Double velocidad;

	public VehiculoAnfibio(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
		this.velocidad = 0.0;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

}
