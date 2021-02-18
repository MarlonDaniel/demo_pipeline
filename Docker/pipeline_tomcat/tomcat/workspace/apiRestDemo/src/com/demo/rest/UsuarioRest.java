package com.demo.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.demo.dao.UsuarioDAOImpl;
import com.demo.entidad.Usuario;

@Path("/usuario")
public class UsuarioRest {
private UsuarioDAOImpl dao;
	
	public UsuarioRest() {
		dao=new UsuarioDAOImpl();
	}
	
	
	
	@POST
	@Path("/registrar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int registrarUsuario(Usuario bean) {
		dao.saveUsuario(bean);
		return dao.saveUsuario(bean);
	}
	
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateUsuario(Usuario bean) {
		int holis= dao.updateUsuario(bean);
		return Response.ok(holis).build();
	}
	
	
	@GET
	@Path("/delete/{cod_Usuario}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteUsuario(@PathParam("cod_Usuario")int cod_Usuario) {
		int holis= dao.deleteUsuario(cod_Usuario);
		return Response.ok(holis).build();
	}
	
	@GET
	@Path("/Listar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response ListarUsuario(){
		return  Response.ok(dao.listAllUsuario()).build();
	}
	
	@GET
	@Path("/ListarId/{cod_Usuario}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response ListarUsuarioId(@PathParam("cod_Usuario")int cod_Usuario){
		return  Response.ok(dao.ListarUsuarioId(cod_Usuario)).build();
	}

}
