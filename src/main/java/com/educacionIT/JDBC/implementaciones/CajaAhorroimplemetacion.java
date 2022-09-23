package com.educacionIT.JDBC.implementaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.educacionIT.Excepciones.JDBCExcepcion;
import com.educacionIT.entidades.CajaAhorro;

public class CajaAhorroimplemetacion extends ImplementacionGenerica<CajaAhorro, String> {

	public CajaAhorroimplemetacion(Connection conexion) throws JDBCExcepcion {
		super(conexion);
	}

	public CajaAhorro buscarPorClavePrimaria(String k) {
		return null;
	}

	public boolean guardar(CajaAhorro cajaAhorro) {
		if (cajaAhorro == null) {
			return false;
		}
		String query = "insert into caja_de_ahorro (id_cuenta, pesos) values (?,?);";
		try {
			if (preparedStatementInsertar == null) {
				preparedStatementInsertar = conexion.prepareStatement(query);
			}
		preparedStatementInsertar.setInt(1, cajaAhorro.getId_cuenta());
		preparedStatementInsertar.setDouble(2, cajaAhorro.getPesos());
		
		
		return preparedStatementInsertar.executeUpdate() == 1; 
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean eliminar(CajaAhorro e) {
		return false;
	}

	public List<CajaAhorro> listar() {
		return null;
	}

	protected boolean insertar() {
		return false;
	}

	protected boolean actualizar() {
		return false;
	}

}
