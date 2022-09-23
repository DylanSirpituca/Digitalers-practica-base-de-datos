package com.educacionIT.entidades;

public class Cliente {

	private int id_cliente;
	private String nombre_c;
	private String calle;
	private String ciudad;
	private int id_asesor;
	private int id_cta_cte;
	private int id_caja_de_ahorro;
	
	public Cliente() {
		super();
	}
	
	public Cliente(int id_cliente, String nombre_c, String calle, String ciudad, int id_asesor, int id_cta_cte,
			int id_caja_de_ahorro) {
		super();
		this.id_cliente = id_cliente;
		this.nombre_c = nombre_c;
		this.calle = calle;
		this.ciudad = ciudad;
		this.id_asesor = id_asesor;
		this.id_cta_cte = id_cta_cte;
		this.id_caja_de_ahorro = id_caja_de_ahorro;
	}
	
	public String toString() {
		return "Cleinte [id_cliente=" + id_cliente + ", nombre_c=" + nombre_c + ", calle=" + calle + ", ciudad="
				+ ciudad + ", id_asesor=" + id_asesor + ", id_cta_cte=" + id_cta_cte + ", id_caja_de_ahorro="
				+ id_caja_de_ahorro + "]";
	}
	
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNombre_c() {
		return nombre_c;
	}
	public void setNombre_c(String nombre_c) {
		this.nombre_c = nombre_c;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getId_asesor() {
		return id_asesor;
	}
	public void setId_asesor(int id_asesor) {
		this.id_asesor = id_asesor;
	}
	public int getId_cta_cte() {
		return id_cta_cte;
	}
	public void setId_cta_cte(int id_cta_cte) {
		this.id_cta_cte = id_cta_cte;
	}
	public int getId_caja_de_ahorro() {
		return id_caja_de_ahorro;
	}
	public void setId_caja_de_ahorro(int id_caja_de_ahorro) {
		this.id_caja_de_ahorro = id_caja_de_ahorro;
	}

}
