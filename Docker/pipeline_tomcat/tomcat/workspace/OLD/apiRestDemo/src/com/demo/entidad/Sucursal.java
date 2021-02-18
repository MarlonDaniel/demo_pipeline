package com.demo.entidad;

import java.io.Serializable;

public class Sucursal implements Serializable{
	private int cod_Sucursal;
	private String Nombre;
	
	public int getCod_Sucursal() {
		return cod_Sucursal;
	}
	public void setCod_Sucursal(int cod_Sucursal) {
		this.cod_Sucursal = cod_Sucursal;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
}
