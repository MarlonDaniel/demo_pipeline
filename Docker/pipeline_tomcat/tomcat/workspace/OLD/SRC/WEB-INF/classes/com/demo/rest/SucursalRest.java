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

import com.demo.dao.SucursalDAOImpl;
import com.demo.entidad.Sucursal;


@Path("/sucursal")
public class SucursalRest {
private SucursalDAOImpl dao;
	
	public SucursalRest() {
		dao=new SucursalDAOImpl();
	}
	
	@POST
	@Path("/registrar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int registrarSucursal(Sucursal bean) {
		return dao.saveSucursal(bean);
	}
	
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int updateSucursal(Sucursal bean) {
		return dao.updateSucursal(bean);
	}
	
	
	@POST
	@Path("/delete/{cod_Sucursal}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int deleteSucursal(@PathParam("cod_Sucursal")int cod_Sucursal) {
		return dao.deleteSucursal(cod_Sucursal);
	}
	
	@GET
	@Path("/Listar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response ListarSucursal(){
		return  Response.ok(dao.listAllSucursal()).build();
	}

}
