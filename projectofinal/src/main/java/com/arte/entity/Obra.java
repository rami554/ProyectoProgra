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

<<<<<<< HEAD
=======
    public Obra() {
		super();
	}
<<<<<<< HEAD
=======
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


>>>>>>> d44bfa1957e4151bd98f5874b3511d8f89a279a0
	@Id
    @Column(name = "id_obra")
    public int getIdObra() {
        return idObra;
    }
>>>>>>> 9f8577523b39b4c3524e34ff6cdc37cfa5193836

=======
   
>>>>>>> 7187d78430895a6203f0a8ee1d2448b6b5bd4ff2
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
