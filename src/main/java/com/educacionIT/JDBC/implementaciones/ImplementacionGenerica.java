package com.educacionIT.JDBC.implementaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.educacionIT.Excepciones.JDBCExcepcion;
import com.educacionIT.JDBC.DAO;

public abstract class ImplementacionGenerica<E,K> implements DAO<E,K> {
	protected PreparedStatement preparedStatementBuscarPorClavePrimaria;
	protected PreparedStatement preparedStatementInsertar;
	protected PreparedStatement preparedStatementEliminar;
	protected PreparedStatement preparedStatementActualizar;
	protected PreparedStatement preparedStatementListar;
	protected Connection conexion;
	
	public ImplementacionGenerica(Connection conexion) throws JDBCExcepcion {
		if (conexion == null) {
			throw new JDBCExcepcion("no puedes implementar sin una conexion");
		}
		
		this.conexion = conexion;
		
		
	}
	protected abstract boolean insertar();
	
	protected abstract boolean actualizar();
	
}