package com.armada.fuerza.excepciones;

public class VehiculoInexistente extends Exception {

	public VehiculoInexistente() {
	}
	
	public VehiculoInexistente(String msj) {
		super(msj);
	}
}
