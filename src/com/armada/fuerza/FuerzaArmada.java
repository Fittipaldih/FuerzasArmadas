package com.armada.fuerza;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.armada.fuerza.enums.TipoDeBatalla;
import com.armada.fuerza.excepciones.VehiculoIncompatible;
import com.armada.fuerza.excepciones.VehiculoInexistente;
import com.armada.fuerza.interfaces.Acuatico;
import com.armada.fuerza.interfaces.Terrestre;
import com.armada.fuerza.interfaces.Volador;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	public FuerzaArmada() {
		convoy = new HashSet<>();
		batallas = new HashMap<>();
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		convoy.add(vehiculo);
	}

	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, double latitud, double longitud) {
		Batalla batalla= new Batalla(nombre, tipo, latitud, longitud);
		batallas.put(nombre, batalla );
	}

	public Batalla getBatalla(String nombre) {
		return batallas.get(nombre);
	}

	public TipoDeBatalla getTipoDeBatallaPorSuNombre(String nombreBatalla) {
		TipoDeBatalla tipoBatalla = batallas.get(nombreBatalla).getTipo();
		return tipoBatalla;
	}
	
	public Vehiculo buscarVehiculoPorCodigo(Integer codigoVehiculo) {
		Vehiculo vehiculoADevolver= null;
		for (Vehiculo vehiculo : convoy) {
			if ( vehiculo.getCodigo().equals(codigoVehiculo)) {
				vehiculoADevolver= vehiculo;
			}
		}
		return vehiculoADevolver;
	}
	
	
	public boolean verificarQueElVehiculoSeaAptoParaLaBatalla(TipoDeBatalla tipoBatallaAEnviar, Vehiculo vehiculoAEnviar) throws VehiculoIncompatible {
		
		switch (tipoBatallaAEnviar) {
		
		case ACUATICA:
			if (vehiculoAEnviar instanceof Acuatico) {
				return true;
			} else {
				throw new VehiculoIncompatible("No se puede asignar este vehiculo a la batalla. [Nombre "  + vehiculoAEnviar.getNombre() + "] Codigo " + vehiculoAEnviar.getCodigo() );
			}
			
		case AEREA:
			if (vehiculoAEnviar instanceof Volador) {
				return true;
			} else {
				throw new VehiculoIncompatible("No se puede asignar este vehiculo a la batalla.[Nombre "  + vehiculoAEnviar.getNombre() + "] Codigo " + vehiculoAEnviar.getCodigo() );
			}
			
		case TERRESTRE:
			if (vehiculoAEnviar instanceof Terrestre) {
				return true;
			} else {
			throw new VehiculoIncompatible("No se puede asignar este vehiculo a la batalla. [Nombre "  + vehiculoAEnviar.getNombre() + "] Codigo " + vehiculoAEnviar.getCodigo());
		}
			
		default:
			System.out.println("Batalla no encontrada");
			return false;
		}
	}
	
	public boolean enviarALaBatalla(String nombreBatalla, Integer codigoVehiculo) throws VehiculoInexistente, VehiculoIncompatible {
	
		TipoDeBatalla tipoBatallaAEnviar= getTipoDeBatallaPorSuNombre(nombreBatalla);
		Vehiculo vehiculoAEnviar= buscarVehiculoPorCodigo(codigoVehiculo);
		
		if ( vehiculoAEnviar != null && tipoBatallaAEnviar != null) {
			verificarQueElVehiculoSeaAptoParaLaBatalla(tipoBatallaAEnviar, vehiculoAEnviar);
			return true;
		} else {
			throw new VehiculoInexistente("Vehiculo no encontrado: Codigo= " + codigoVehiculo);
		}
	} 
}
