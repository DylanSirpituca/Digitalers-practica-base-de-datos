package com.educacionIT.Tarea03;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import com.educacionIT.Excepciones.JDBCExcepcion;
import com.educacionIT.JDBC.conexiones.AdministradorMariaDB;
import com.educacionIT.JDBC.implementaciones.EmpleadoImplementacion;
import com.educacionIT.entidades.Empleado;

public class AppEmpleado {
	public static void main(String[] args) throws InterruptedException {
		AdministradorMariaDB administradorMariaDB = AdministradorMariaDB.getAdministradorMariaDB();

		EmpleadoImplementacion empleadoImplementacion = null;
		try {
			empleadoImplementacion = new EmpleadoImplementacion(administradorMariaDB.getConexion());
		} catch (JDBCExcepcion e) {
			e.printStackTrace();
		}

		Empleado[] empleados;

		int cantidadEmpleado = Integer.valueOf(JOptionPane.showInputDialog("cuantos empleados va a ingresar"));

		empleados = new Empleado[cantidadEmpleado];

		for (int i = 0; i < empleados.length; i++) {
			Empleado empleado = new Empleado();
			empleado.setSucursal(Integer.valueOf(JOptionPane.showInputDialog("ingresar sucursal:")));
			empleado.setId_jefe(Integer.valueOf(JOptionPane.showInputDialog("ingresar jefe:")));
			empleado.setId_empleado(i + 502);
			empleado.setNombre(JOptionPane.showInputDialog("ingresar nombre:"));
			empleado.setTelefono(Integer.valueOf((int) (Math.random() * 1500000000)));
			empleado.setFecha_de_ingreso(LocalDateTime.now());

			empleados[i] = empleado;

			System.out.println("insertando empleado ID: --->" + empleado.getId_empleado());
			empleadoImplementacion.guardar(empleado);
			Thread.sleep(1000);

			System.out.println("Empleado ID: " + empleado.getId_empleado() + " registrado");
		}

	}

}
