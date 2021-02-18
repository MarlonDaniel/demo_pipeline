package com.demo.entidad;

import java.io.Serializable;

public class Producto implements Serializable{
	private int cod_Producto;
	private String Nombre;
	private double Precio;
	
	public int getCod_Producto() {
		return cod_Producto;
	}
	public void setCod_Producto(int cod_Producto) {
		this.cod_Producto = cod_Producto;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	
}
