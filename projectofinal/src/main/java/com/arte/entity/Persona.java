package com.arte.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="persona",schema="public")
public class Persona {
	@Id
    private int idPersona;
    private String nombre;
    private String apellido;
    private int celular;
    private String pais;
    private String ciudad;
    private String profesion;

    public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(int idPersona, String nombre, String apellido, int celular, String pais, String ciudad,
			String profesion) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.pais = pais;
		this.ciudad = ciudad;
		this.profesion = profesion;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	

}
