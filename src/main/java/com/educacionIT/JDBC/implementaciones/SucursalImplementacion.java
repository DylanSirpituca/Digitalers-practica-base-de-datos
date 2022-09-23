package com.educacionIT.JDBC.implementaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.educacionIT.Excepciones.JDBCExcepcion;
import com.educacionIT.entidades.Sucursal;

public class SucursalImplementacion extends ImplementacionGenerica<Sucursal, Integer>{

	public SucursalImplementacion(Connection conexion) throws JDBCExcepcion {
		super(conexion);
	}

	public Sucursal buscarPorClavePrimaria(Integer k) {
		return null;
	}

	public boolean guardar(Sucursal sucursal) {
		if (sucursal == null) {
			return false;
		}
		String query = "insert into sucursales (id, ciudad, calle) values (?,?,?);";
		try {
			if (preparedStatementInsertar == null) {
				preparedStatementInsertar = conexion.prepareStatement(query);
			}
		preparedStatementInsertar.setInt(1, sucursal.getId());
		preparedStatementInsertar.setString(2, sucursal.getCiudad());
		preparedStatementInsertar.setString(3, sucursal.getCalle());
		
		return preparedStatementInsertar.executeUpdate() == 1; 
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean eliminar(Sucursal e) {
		return false;
	}

	public List<Sucursal> listar() {
		return null;
	}

	protected boolean insertar() {
		return false;
	}

	protected boolean actualizar() {
		return false;
	}
	
}
