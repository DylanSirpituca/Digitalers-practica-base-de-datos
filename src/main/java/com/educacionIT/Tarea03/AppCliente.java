package com.educacionIT.Tarea03;

import javax.swing.JOptionPane;

import com.educacionIT.Excepciones.JDBCExcepcion;
import com.educacionIT.JDBC.conexiones.AdministradorMariaDB;
import com.educacionIT.JDBC.implementaciones.ClienteImplementacion;
import com.educacionIT.entidades.Cliente;

public class AppCliente {
	public static void main(String[] args) throws InterruptedException{
		AdministradorMariaDB administradorMariaDB = AdministradorMariaDB.getAdministradorMariaDB();
		
		ClienteImplementacion clienteImplementacion = null;
		try {
			clienteImplementacion = new ClienteImplementacion(administradorMariaDB.getConexion());
		} catch (JDBCExcepcion e) {
			e.printStackTrace();
		}
		
		Cliente[] clientes;
		
		int cantidadC = Integer.valueOf(JOptionPane.showInputDialog("cuantos clientes va a ingresar"));
		
		clientes = new Cliente[cantidadC];
		
		for (int i = 0; i < clientes.length; i++) {
			Cliente cliente = new Cliente();
			cliente.setId_cliente(i + 700);
			cliente.setNombre_c(JOptionPane.showInputDialog("ingresar el nombre del cliente:"));
			cliente.setCalle(JOptionPane.showInputDialog("ingresar calle del cliente:"));
			cliente.setCiudad(JOptionPane.showInputDialog("ingresar ciudad:"));
			cliente.setId_asesor(Integer.valueOf(JOptionPane.showInputDialog("ingresar id empleado asesor:")));
			cliente.setId_cta_cte(Integer.valueOf(JOptionPane.showInputDialog("ingresar N° de cta cte:")));
			cliente.setId_cta_cte(Integer.valueOf(JOptionPane.showInputDialog("ingresar N° de caja de ahorro:")));
			
			clientes[i] = cliente;
			
			System.out.println("insertando cliente N°: --->" + cliente.getId_cliente());
			clienteImplementacion.guardar(cliente);
			Thread.sleep(1000);
			
			System.out.println("Cliente registrado");
		}
		
		
		
	}
}
