package com.armada.fuerza;

import java.util.HashSet;
import java.util.Set;

import com.armada.fuerza.enums.TipoDeBatalla;

public class Batalla {
	private String nombre;
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	
	public Batalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		super();
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		vehiculosEnLaBatalla = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public Double getLatitud() {
		return latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public Integer getCantidadVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla.size();
	}
	
}
