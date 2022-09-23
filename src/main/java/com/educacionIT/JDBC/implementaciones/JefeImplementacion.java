package com.educacionIT.JDBC.implementaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.educacionIT.Excepciones.JDBCExcepcion;
import com.educacionIT.entidades.Jefe;

public class JefeImplementacion extends ImplementacionGenerica<Jefe, Integer> {

	public JefeImplementacion(Connection conexion) throws JDBCExcepcion {
		super(conexion);
	}

	public Jefe buscarPorClavePrimaria(Integer k) {
		return null;
	}

	public boolean guardar(Jefe jefe) {
		if (jefe == null) {
			return false;
		}
		String query = "insert into jefes (sucursal, id_jefe, nombre, telefono) values (?,?,?,?);";
		try {
			if (preparedStatementInsertar == null) {
				preparedStatementInsertar = conexion.prepareStatement(query);
			}
		preparedStatementInsertar.setInt(1, jefe.getSucursal());
		preparedStatementInsertar.setInt(2, jefe.getId_jefe());
		preparedStatementInsertar.setString(3, jefe.getNombre());
		preparedStatementInsertar.setInt(4, jefe.getTelefono());
		
		return preparedStatementInsertar.executeUpdate() == 1; 
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean eliminar(Jefe e) {
		return false;
	}

	public List<Jefe> listar() {
		return null;
	}

	protected boolean insertar() {
		return false;
	}

	protected boolean actualizar() {
		return false;
	}

}
