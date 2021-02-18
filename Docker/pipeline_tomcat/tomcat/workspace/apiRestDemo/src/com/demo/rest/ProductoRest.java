package com.demo.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.demo.dao.ProductoDAOImpl;
import com.demo.entidad.Producto;

@Path("/producto")
public class ProductoRest {
	private ProductoDAOImpl dao;
	
	public ProductoRest() {
		dao=new ProductoDAOImpl();
	}
	
	@POST
	@Path("/registrar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int registrarProducto(Producto bean) {
		return dao.saveProducto(bean);
	}
	
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int updateProducto(Producto bean) {
		return dao.updateProducto(bean);
	}
	
	
	@POST
	@Path("/delete/{cod_Producto}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int deleteProducto(@PathParam("cod_Producto")int cod_Producto) {
		return dao.deleteProducto(cod_Producto);
	}
	
	@GET
	@Path("/Listar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response ListarProducto(){
		return  Response.ok(dao.listAllProducto()).build();
	}
}
