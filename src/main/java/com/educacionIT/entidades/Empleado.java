package com.educacionIT.entidades;

import java.time.LocalDateTime;

public class Empleado {
	
	private int sucursal;
	private int id_jefe;
	private int id_empleado;
	private String nombre;
	private int telefono;
	private LocalDateTime fecha_de_ingreso;
	
	
	public Empleado() {
		super();
	}
	public Empleado(int sucursal, int id_jefe, int id_empleado, String nombre, int telefono,
			LocalDateTime fecha_de_ingreso) {
		super();
		this.sucursal = sucursal;
		this.id_jefe = id_jefe;
		this.id_empleado = id_empleado;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fecha_de_ingreso = fecha_de_ingreso;
	}
	
	public String toString() {
		return "Empleado [sucursal=" + sucursal + ", id_jefe=" + id_jefe + ", id_empleado=" + id_empleado + ", nombre="
				+ nombre + ", telefono=" + telefono + ", fecha_de_ingreso=" + fecha_de_ingreso + "]";
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
	public int getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
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
	public LocalDateTime getFecha_de_ingreso() {
		return fecha_de_ingreso;
	}
	public void setFecha_de_ingreso(LocalDateTime localDateTime) {
		this.fecha_de_ingreso = localDateTime;
	}
	
	
}
