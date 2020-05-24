package com.arte.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name="exposicion",schema="public")
public class Exposicion {
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
		// TODO Auto-generated constructor stub
	}

	@Id
    @Column(name = "id_exposicion")
    public int getIdExposicion() {
        return idExposicion;
    }

    public void setIdExposicion(int idExposicion) {
        this.idExposicion = idExposicion;
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
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Id
    @Column(name = "fechainauguracion")
    public Date getFechainauguracion() {
        return fechainauguracion;
    }

    public void setFechainauguracion(Date fechainauguracion) {
        this.fechainauguracion = fechainauguracion;
    }

    @Basic
    @Column(name = "fechaclausura")
    public Date getFechaclausura() {
        return fechaclausura;
    }

    public void setFechaclausura(Date fechaclausura) {
        this.fechaclausura = fechaclausura;
    }

    @Id
    @Column(name = "salon1")
    public String getSalon1() {
        return salon1;
    }

    public void setSalon1(String salon1) {
        this.salon1 = salon1;
    }

    @Id
    @Column(name = "salon2")
    public String getSalon2() {
        return salon2;
    }

    public void setSalon2(String salon2) {
        this.salon2 = salon2;
    }

    @Id
    @Column(name = "salon3")
    public String getSalon3() {
        return salon3;
    }

    public void setSalon3(String salon3) {
        this.salon3 = salon3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exposicion that = (Exposicion) o;
        return idExposicion == that.idExposicion &&
                Objects.equals(titulo, that.titulo) &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(fechainauguracion, that.fechainauguracion) &&
                Objects.equals(fechaclausura, that.fechaclausura) &&
                Objects.equals(salon1, that.salon1) &&
                Objects.equals(salon2, that.salon2) &&
                Objects.equals(salon3, that.salon3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idExposicion, titulo, descripcion, fechainauguracion, fechaclausura, salon1, salon2, salon3);
    }
}
