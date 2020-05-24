package com.arte.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name="venta",schema="public")
public class Venta {
    private int idVenta;
    private Date fechaventa;

    @Id
    @Column(name = "id_venta")
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    @Basic
    @Column(name = "fechaventa")
    public Date getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(Date fechaventa) {
        this.fechaventa = fechaventa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venta venta = (Venta) o;
        return idVenta == venta.idVenta &&
                Objects.equals(fechaventa, venta.fechaventa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVenta, fechaventa);
    }
}
