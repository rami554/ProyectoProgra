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
    private Date fechaventa;

    public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venta(int idVenta, Date fechaventa) {
		super();
		this.idVenta = idVenta;
		this.fechaventa = fechaventa;
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
