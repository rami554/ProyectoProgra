package com.arte.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Date;

@Entity
@Table(name="venta",schema="public")
public class Venta {
	@Id
    private int idVenta;
    private int idObra;
    private Date fechaventa;
    private int idCliente;

    public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venta(int idVenta, int idObra, Date fechaventa, int idCliente) {
		super();
		this.idVenta = idVenta;
		this.idObra = idObra;
		this.fechaventa = fechaventa;
		this.idCliente = idCliente;
	}

	public int getIdObra() {
		return idObra;
	}

	public void setIdObra(int idObra) {
		this.idObra = idObra;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdVenta() {
		return idVenta;
	}
	
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public Date getFechaventa() {
		return fechaventa;
	}

	public void setFechaventa(Date fechaventa) {
		this.fechaventa = fechaventa;
	}

}
