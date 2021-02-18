package com.demo.interfaces;

import java.util.List;

import com.demo.entidad.Producto;

public interface ProductoDAO {
	public int saveProducto(Producto bean);
	public int updateProducto(Producto bean);
	public int deleteProducto(int cod_Producto);
	public List<Producto> listAllProducto();
}
