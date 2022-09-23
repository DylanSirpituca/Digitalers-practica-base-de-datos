package com.educacionIT.entidades;

public class Sucursal {

	private int id;
	private String ciudad;
	private String calle;
	
	public Sucursal() {
		super();
	}
	public Sucursal(int id, String ciudad, String calle) {
		super();
		this.id = id;
		this.ciudad = ciudad;
		this.calle = calle;
	}
	
	public String toString() {
		return "Sucursal [id=" + id + ", ciudad=" + ciudad + ", calle=" + calle + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}

}
