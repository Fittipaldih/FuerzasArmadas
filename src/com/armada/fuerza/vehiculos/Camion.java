package com.armada.fuerza.vehiculos;

import com.armada.fuerza.Vehiculo;
import com.armada.fuerza.interfaces.Terrestre;

public class Camion extends Vehiculo  implements Terrestre{
	private Double velocidad;
	public Camion(int codigo, String nombre) {
		super(codigo, nombre);
		this.velocidad=0.0;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

}
