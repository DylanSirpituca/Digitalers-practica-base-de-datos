package com.educacionIT.JDBC.implementaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


import com.educacionIT.Excepciones.JDBCExcepcion;
import com.educacionIT.entidades.Cliente;

public class ClienteImplementacion extends ImplementacionGenerica<Cliente, String> {

	public ClienteImplementacion(Connection conexion) throws JDBCExcepcion {
		super(conexion);
	}
	
	public Cliente buscarPorClavePrimaria(int i) {
		return null;
	}

	public boolean guardar(Cliente cliente) {
		if (cliente == null) {
			return false;
		}
		String query = "insert into clientes (id_cliente, nombre_c, calle, ciudad, id_asesor, id_cta_cte, id_caja_de_ahorro) values (?,?,?,?,?,?,?);";
		try {
			if (preparedStatementInsertar == null) {
				preparedStatementInsertar = conexion.prepareStatement(query);
			}
		preparedStatementInsertar.setInt(1, cliente.getId_cliente());
		preparedStatementInsertar.setString(2, cliente.getNombre_c());
		preparedStatementInsertar.setString(3, cliente.getCalle());
		preparedStatementInsertar.setString(4, cliente.getCiudad());
		preparedStatementInsertar.setInt(5, cliente.getId_asesor());
		preparedStatementInsertar.setInt(6, cliente.getId_cta_cte());
		preparedStatementInsertar.setInt(7, cliente.getId_caja_de_ahorro());
		
		return preparedStatementInsertar.executeUpdate() == 1; 
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean eliminar(Cliente e) {
		return false;
	}

	public List<Cliente> listar() {
		return null;
	}

	public boolean guardar1(Cliente cliente) {
		if (buscarPorClavePrimaria(cliente.getId_cliente()) == null) {
			return insertar(cliente);
		}
		return actualizar(cliente);
	}
	
	protected boolean insertar(Cliente cliente) {
		return false;
	}

	protected boolean actualizar(Cliente cliente) {
		return false;
	}

	@Override
	public Cliente buscarPorClavePrimaria(String k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean insertar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean actualizar() {
		// TODO Auto-generated method stub
		return false;
	}

}
