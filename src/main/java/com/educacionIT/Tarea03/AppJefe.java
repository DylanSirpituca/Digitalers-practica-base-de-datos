package com.educacionIT.Tarea03;

import javax.swing.JOptionPane;

import com.educacionIT.Excepciones.JDBCExcepcion;
import com.educacionIT.JDBC.conexiones.AdministradorMariaDB;
import com.educacionIT.JDBC.implementaciones.JefeImplementacion;
import com.educacionIT.entidades.Jefe;

public class AppJefe {
	public static void main(String[] args) throws InterruptedException {
		AdministradorMariaDB administradorMariaDB = AdministradorMariaDB.getAdministradorMariaDB();

		JefeImplementacion jefeImplementacion = null;
		try {
			jefeImplementacion = new JefeImplementacion(administradorMariaDB.getConexion());
		} catch (JDBCExcepcion e) {
			e.printStackTrace();
		}

		Jefe[] jefes;

		int cantidadJefes = Integer.valueOf(JOptionPane.showInputDialog("cuantos jefe va a ingresar"));

		jefes = new Jefe[cantidadJefes];

		for (int i = 0; i < jefes.length; i++) {
			Jefe jefe = new Jefe();
			jefe.setSucursal(Integer.valueOf(JOptionPane.showInputDialog("ingresar sucursal:")));
			jefe.setId_jefe(i + 11);
			jefe.setNombre(JOptionPane.showInputDialog("ingresar nombre:"));
			jefe.setTelefono(Integer.valueOf(JOptionPane.showInputDialog("ingresar telefono:")));
			
			jefes[i] = jefe;

			System.out.println("insertando jefe ID: ---> " + jefe.getId_jefe());
			jefeImplementacion.guardar(jefe);
			Thread.sleep(1000);

			System.out.println("jefe ID: " + jefe.getId_jefe() + " registrado");
		}

	}
}
