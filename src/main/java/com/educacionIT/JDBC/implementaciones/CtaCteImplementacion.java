package com.educacionIT.JDBC.implementaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.educacionIT.Excepciones.JDBCExcepcion;
import com.educacionIT.entidades.CtaCte;

public class CtaCteImplementacion extends ImplementacionGenerica<CtaCte, String> {

	public CtaCteImplementacion(Connection conexion) throws JDBCExcepcion {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	public CtaCte buscarPorClavePrimaria(String k) {
		return null;
	}

	public boolean guardar(CtaCte ctacte) {
		if (ctacte == null) {
			return false;
		}
		String query = "insert into cta_cte (id_cuenta, pesos) values (?,?);";
		try {
			if (preparedStatementInsertar == null) {
				preparedStatementInsertar = conexion.prepareStatement(query);
			}
		preparedStatementInsertar.setInt(1, ctacte.getId_cuenta());
		preparedStatementInsertar.setDouble(2, ctacte.getPesos());
		
		
		return preparedStatementInsertar.executeUpdate() == 1; 
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean eliminar(CtaCte e) {
		return false;
	}

	public List<CtaCte> listar() {
		return null;
	}

	protected boolean insertar() {
		return false;
	}

	protected boolean actualizar() {
		return false;
	}

}
