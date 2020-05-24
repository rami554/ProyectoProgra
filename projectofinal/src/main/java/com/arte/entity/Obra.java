package com.arte.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="obra",schema="public")
public class Obra {
	
	@Id
    private int idObra;
    private String titulo;
    private String estilo;
    private float precio;
    private int idArtista;

    public Obra() {
		super();
	}
   
	public Obra(int idObra, String titulo, String estilo, float precio, int idArtista) {
		super();
		this.idObra = idObra;
		this.titulo = titulo;
		this.estilo = estilo;
		this.precio = precio;
		this.idArtista = idArtista;
	}

	public int getIdObra() {
		return idObra;
	}

	public void setIdObra(int idObra) {
		this.idObra = idObra;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(int idArtista) {
		this.idArtista = idArtista;
	}
    
}
