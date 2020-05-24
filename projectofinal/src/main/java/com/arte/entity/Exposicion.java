package com.arte.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exposicion",schema="public")
public class Exposicion {
    
	@Id
	private int idExposicion;
    private String titulo;
    private String descripcion;
    private Date fechainauguracion;
    private Date fechaclausura;
    private String salon1;
    private String salon2;
    private String salon3;
    
    public Exposicion() {
		super();
	}

	public Exposicion(int idExposicion, String titulo, String descripcion, Date fechainauguracion, Date fechaclausura, String salon1, String salon2, String salon3) {
		super();
		this.idExposicion = idExposicion;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechainauguracion = fechainauguracion;
		this.fechaclausura = fechaclausura;
		this.salon1 = salon1;
		this.salon2 = salon2;
		this.salon3 = salon3;

	}

	public int getIdExposicion() {
		return idExposicion;
	}

	public void setIdExposicion(int idExposicion) {
		this.idExposicion = idExposicion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechainauguracion() {
		return fechainauguracion;
	}

	public void setFechainauguracion(Date fechainauguracion) {
		this.fechainauguracion = fechainauguracion;
	}

	public Date getFechaclausura() {
		return fechaclausura;
	}

	public void setFechaclausura(Date fechaclausura) {
		this.fechaclausura = fechaclausura;
	}

	public String getSalon1() {
		return salon1;
	}

	public void setSalon1(String salon1) {
		this.salon1 = salon1;
	}

	public String getSalon2() {
		return salon2;
	}

	public void setSalon2(String salon2) {
		this.salon2 = salon2;
	}

	public String getSalon3() {
		return salon3;
	}

	public void setSalon3(String salon3) {
		this.salon3 = salon3;
	}
	
}


    
