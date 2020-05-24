package com.arte.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="obraexpo",schema="public")
public class Obraexpo {
	
	@Id
    private int id_obraexpo;
    private int id_obra;
    private int id_exposicion;
    private Date exposicion_fechainauguracion;
    private String exposicion_salon1;
    private String exposicion_salon2;
    private String exposicion_salon3;
	
    public Obraexpo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Obraexpo(int id_obraexpo, int id_obra, int id_exposicion, Date exposicion_fechainauguracion, String exposicion_salon1, String exposicion_salon2, String exposicion_salon3) {
		super();
		this.id_obraexpo = id_obraexpo;
		this.id_obra = id_obra;
		this.id_exposicion = id_exposicion;
		this.exposicion_fechainauguracion = exposicion_fechainauguracion;
		this.exposicion_salon1 = exposicion_salon1;
		this.exposicion_salon2 = exposicion_salon2;
		this.exposicion_salon3 = exposicion_salon3;
	}

	public int getId_obraexpo() {
		return id_obraexpo;
	}

	public void setId_obraexpo(int id_obraexpo) {
		this.id_obraexpo = id_obraexpo;
	}

	public int getId_obra() {
		return id_obra;
	}

	public void setId_obra(int id_obra) {
		this.id_obra = id_obra;
	}

	public int getId_exposicion() {
		return id_exposicion;
	}

	public void setId_exposicion(int id_exposicion) {
		this.id_exposicion = id_exposicion;
	}

	public Date getExposicion_fechainauguracion() {
		return exposicion_fechainauguracion;
	}

	public void setExposicion_fechainauguracion(Date exposicion_fechainauguracion) {
		this.exposicion_fechainauguracion = exposicion_fechainauguracion;
	}

	public String getExposicion_salon1() {
		return exposicion_salon1;
	}

	public void setExposicion_salon1(String exposicion_salon1) {
		this.exposicion_salon1 = exposicion_salon1;
	}

	public String getExposicion_salon2() {
		return exposicion_salon2;
	}

	public void setExposicion_salon2(String exposicion_salon2) {
		this.exposicion_salon2 = exposicion_salon2;
	}

	public String getExposicion_salon3() {
		return exposicion_salon3;
	}

	public void setExposicion_salon3(String exposicion_salon3) {
		this.exposicion_salon3 = exposicion_salon3;
	}
	    
}
