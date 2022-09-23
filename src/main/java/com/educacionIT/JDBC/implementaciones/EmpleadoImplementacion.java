package com.educacionIT.JDBC.implementaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.educacionIT.Excepciones.JDBCExcepcion;
import com.educacionIT.entidades.Empleado;

public class EmpleadoImplementacion extends ImplementacionGenerica<Empleado, Integer> {

	public EmpleadoImplementacion(Connection conexion) throws JDBCExcepcion {
		super(conexion);
	}

	public Empleado buscarPorClavePrimaria(Integer k) {
		return null;
	}

	public boolean guardar(Empleado empleado) {
		if (empleado == null) {
			return false;
		}
		String query = "insert into Empleados (sucursal, id_jefe, id_empleado, nombre, telefono, fecha_de_ingreso) values (?,?,?,?,?,now());";
		try {
			if (preparedStatementInsertar == null) {
				preparedStatementInsertar = conexion.prepareStatement(query);
			}
		preparedStatementInsertar.setInt(1, empleado.getSucursal());
		preparedStatementInsertar.setInt(2, empleado.getId_jefe());
		preparedStatementInsertar.setInt(3, empleado.getId_empleado());
		preparedStatementInsertar.setString(4, empleado.getNombre());
		preparedStatementInsertar.setInt(5, empleado.getTelefono());
		
		
		return preparedStatementInsertar.executeUpdate() == 1; 
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean eliminar(Empleado e) {
		return false;
	}

	public List<Empleado> listar() {
		return null;
	}

	protected boolean insertar() {
		return false;
	}

	protected boolean actualizar() {
		return false;
	}

}
