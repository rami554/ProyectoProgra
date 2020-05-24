package com.arte.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="obra",schema="public")
public class Obra {
    private int idObra;
    private String titulo;
    private String estilo;
    private float precio;
    private int idArtista;

    public Obra() {
		super();
		// TODO Auto-generated constructor stub
	}
    

	public Obra(int idObra, String titulo, String estilo, float precio, int idArtista) {
		super();
		this.idObra = idObra;
		this.titulo = titulo;
		this.estilo = estilo;
		this.precio = precio;
		this.idArtista = idArtista;
	}


	@Id
    @Column(name = "id_obra")
    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    @Basic
    @Column(name = "titulo")
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Basic
    @Column(name = "estilo")
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Basic
    @Column(name = "precio")
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Basic
    @Column(name = "id_artista")
    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obra obra = (Obra) o;
        return idObra == obra.idObra &&
                Float.compare(obra.precio, precio) == 0 &&
                idArtista == obra.idArtista &&
                Objects.equals(titulo, obra.titulo) &&
                Objects.equals(estilo, obra.estilo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObra, titulo, estilo, precio, idArtista);
    }
}
