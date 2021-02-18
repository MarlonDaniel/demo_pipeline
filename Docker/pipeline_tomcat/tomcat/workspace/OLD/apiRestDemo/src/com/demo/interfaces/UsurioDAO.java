package com.demo.interfaces;

import java.util.List;

import com.demo.entidad.Usuario;

public interface UsurioDAO {
	public int saveUsuario(Usuario bean);
	public int updateUsuario(Usuario bean);
	public int deleteUsuario(int cod_Usuario);
	public List<Usuario> listAllUsuario();
	public List<Usuario> ListarUsuarioId(int cod_Usuario);
}
