package com.armada.fuerza.vehiculos;

import com.armada.fuerza.Vehiculo;
import com.armada.fuerza.interfaces.Volador;

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
