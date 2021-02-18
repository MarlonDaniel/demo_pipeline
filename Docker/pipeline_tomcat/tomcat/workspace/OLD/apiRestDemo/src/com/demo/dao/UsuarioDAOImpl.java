package com.demo.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.demo.entidad.Sucursal;
import com.demo.entidad.Usuario;
import com.demo.interfaces.UsurioDAO;

import utils.MysqlDBConexion;

public class UsuarioDAOImpl implements UsurioDAO {

	@Override
	public int saveUsuario(Usuario bean) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call sp_saveUsuario(?,?,?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setString(1,bean.getNombre());
			cstm.setString(2,bean.getUser());
			cstm.setString(3,bean.getPassword());
			cstm.setInt(4,bean.getIdsucursal());
			estado=cstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	@Override
	public int updateUsuario(Usuario bean) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call sp_updateUsuario(?,?,?,?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1,bean.getCod_Usuario());
			cstm.setString(2,bean.getNombre());
			cstm.setString(3,bean.getUser());
			cstm.setString(4,bean.getPassword());
			cstm.setInt(5,bean.getIdsucursal());
			estado=cstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	@Override
	public int deleteUsuario(int cod_Usuario) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call sp_deleteUsuario(?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1,cod_Usuario);
			estado=cstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	@Override
	public List<Usuario> listAllUsuario() {
		List<Usuario> lista=new ArrayList<Usuario>();
		Usuario bean=null;
		Sucursal sucursal=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call sp_listarUsuario()";
			cstm=cn.prepareCall(sql);
			rs=cstm.executeQuery();
			while(rs.next()) {
				bean=new Usuario();
				bean.setCod_Usuario(rs.getInt(1));
				bean.setNombre(rs.getString(2));
				bean.setUser(rs.getString(3));
				bean.setPassword(rs.getString(4));
				sucursal=new Sucursal();
				sucursal.setCod_Sucursal(rs.getInt(5));
				sucursal.setNombre(rs.getString(6));
				bean.setSucursal(sucursal);
				lista.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(rs!=null) rs.close();
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return lista;
	}

	@Override
	public List<Usuario> ListarUsuarioId(int cod_Usuario) {
		List<Usuario> lista=new ArrayList<Usuario>();
		Usuario bean=null;
		Sucursal sucursal=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call sp_listarUsuarioId(?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1,cod_Usuario);
			rs=cstm.executeQuery();
			while(rs.next()) {
				bean=new Usuario();
				bean.setCod_Usuario(rs.getInt(1));
				bean.setNombre(rs.getString(2));
				bean.setUser(rs.getString(3));
				bean.setPassword(rs.getString(4));
				sucursal=new Sucursal();
				sucursal.setCod_Sucursal(rs.getInt(5));
				sucursal.setNombre(rs.getString(6));
				bean.setSucursal(sucursal);
				lista.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(rs!=null) rs.close();
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return lista;
	}
	
	


}
