package com.educacionIT.Tarea03;

import javax.swing.JOptionPane;

import com.educacionIT.Excepciones.JDBCExcepcion;
import com.educacionIT.JDBC.conexiones.AdministradorMariaDB;
import com.educacionIT.JDBC.implementaciones.SucursalImplementacion;
import com.educacionIT.entidades.Sucursal;

public class AppSucursal {
	public static void main(String[] args) throws InterruptedException {
		AdministradorMariaDB administradorMariaDB = AdministradorMariaDB.getAdministradorMariaDB();

		SucursalImplementacion sucursalImplementacion = null;
		try {
			sucursalImplementacion = new SucursalImplementacion(administradorMariaDB.getConexion());
		} catch (JDBCExcepcion e) {
			e.printStackTrace();
		}

		Sucursal[] sucursales;

		int cantidadSucursal = Integer.valueOf(JOptionPane.showInputDialog("Cuantas sucursales va a ingresar"));

		sucursales = new Sucursal[cantidadSucursal];
		
		for (int i = 0; i < sucursales.length; i++) {
			Sucursal sucursal = new Sucursal();
			
			sucursal.setId(i + 1100);
			sucursal.setCiudad(JOptionPane.showInputDialog("ingresar ciudad:"));
			sucursal.setCalle(JOptionPane.showInputDialog("ingresar calle:"));
			
			sucursales[i] = sucursal;
			
			System.out.println("insertando sucursal N°: --->" + sucursal.getId());
			sucursalImplementacion.guardar(sucursal);
			Thread.sleep(1000);
			
			System.out.println("Sucursal N°: " + sucursal.getId() + " registrada.");
			
		}

	}
}
