package com.educacionIT.entidades;

public class Jefe {

	private int sucursal;
	private int id_jefe;
	private String nombre;
	private int telefono;

	public Jefe() {
		super();
	}

	public Jefe(int sucursal, int id_jefe, String nombre, int telefono) {
		super();
		this.sucursal = sucursal;
		this.id_jefe = id_jefe;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String toString() {
		return "Jefe [sucursal=" + sucursal + ", id_jefe=" + id_jefe + ", nombre=" + nombre + ", telefono=" + telefono
				+ "]";
	}

	public int getSucursal() {
		return sucursal;
	}

	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}

	public int getId_jefe() {
		return id_jefe;
	}

	public void setId_jefe(int id_jefe) {
		this.id_jefe = id_jefe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

}
