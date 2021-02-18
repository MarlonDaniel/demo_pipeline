package com.demo.interfaces;

import java.util.List;

import com.demo.entidad.Sucursal;

public interface SucursalDAO {
	public int saveSucursal(Sucursal bean);
	public int updateSucursal(Sucursal bean);
	public int deleteSucursal(int cod_Sucursal);
	public List<Sucursal> listAllSucursal();
}
