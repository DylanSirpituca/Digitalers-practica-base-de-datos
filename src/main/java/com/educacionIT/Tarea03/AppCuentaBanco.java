package com.educacionIT.Tarea03;

import com.educacionIT.Excepciones.JDBCExcepcion;
import com.educacionIT.JDBC.conexiones.AdministradorMariaDB;
import com.educacionIT.JDBC.implementaciones.CajaAhorroimplemetacion;
import com.educacionIT.JDBC.implementaciones.CtaCteImplementacion;
import com.educacionIT.entidades.CajaAhorro;
import com.educacionIT.entidades.CtaCte;

public class AppCuentaBanco {
	public static void main(String[] args) throws InterruptedException {
		AdministradorMariaDB administradorMariaDB = AdministradorMariaDB.getAdministradorMariaDB();

		CajaAhorroimplemetacion cajaAhorroimplemetacion = null;
		try {
			cajaAhorroimplemetacion = new CajaAhorroimplemetacion(administradorMariaDB.getConexion());
		} catch (JDBCExcepcion e) {
			e.printStackTrace();
		}

		System.out.println("**iniciando regitro en Caja de ahorro**");
		Thread.sleep(1000);
		for (int i = 0; i < 3; i++) {
			CajaAhorro cajaAhorro = new CajaAhorro();

			cajaAhorro.setId_cuenta(i + 28400);
			cajaAhorro.setPesos(Double.valueOf((int) (Math.random() * 100000+99999)));
			Thread.sleep(1000);
			System.out.println("registrando cuenta N°: --> " + cajaAhorro.getId_cuenta());
			cajaAhorroimplemetacion.guardar(cajaAhorro);
			Thread.sleep(1000);

			System.out.println("Cuenta N°:" + cajaAhorro.getId_cuenta() + " registrada.");

		}
		System.out.println("**cerrando regitro de caja de ahorro**");
		
		Thread.sleep(2000);
		System.out.println("**iniciando regitro en Cta Cte**");
		Thread.sleep(1000);

		CtaCteImplementacion ctaCteImplementacion = null;
		try {
			ctaCteImplementacion = new CtaCteImplementacion(administradorMariaDB.getConexion());
		} catch (JDBCExcepcion e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 3; i++) {
			CtaCte ctacte = new CtaCte();

			ctacte.setId_cuenta(i + 12600);
			ctacte.setPesos(Double.valueOf((int) (Math.random() * 100000+99999)));
			Thread.sleep(1000);
			System.out.println("registrando cuenta N°: --> " + ctacte.getId_cuenta());
			ctaCteImplementacion.guardar(ctacte);
			Thread.sleep(1000);

			System.out.println("Cuenta N°:" + ctacte.getId_cuenta() + "registrada.");

		}
		System.out.println("**cerrando regitro de cta cte**");
	}
}
