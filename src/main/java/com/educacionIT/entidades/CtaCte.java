package com.educacionIT.entidades;

public class CtaCte {

	private int id_cuenta;
	private double pesos;

	public CtaCte() {
		super();
	}

	public CtaCte(int id_cuenta, double pesos) {
		super();
		this.id_cuenta = id_cuenta;
		this.pesos = pesos;
	}

	public String toString() {
		return "CtaCte [id_cuenta=" + id_cuenta + ", pesos=" + pesos + "]";
	}

	public int getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(int id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public double getPesos() {
		return pesos;
	}

	public void setPesos(double pesos) {
		this.pesos = pesos;
	}

}
