package com.demo.entidad;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;

public class Usuario implements Serializable {
	private int cod_Usuario;
	private String Nombre;
	private String User;
	private String Password;
	
	//@JsonIgnore
	private Sucursal sucursal;
	
	private int idsucursal;
	
	
	public int getIdsucursal() {
		return idsucursal;
	}
	public void setIdsucursal(int idsucursal) {
		this.idsucursal = idsucursal;
	}
	public int getCod_Usuario() {
		return cod_Usuario;
	}
	public void setCod_Usuario(int cod_Usuario) {
		this.cod_Usuario = cod_Usuario;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
}
