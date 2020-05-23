package bo.edu.ucb.entitys;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "venta", schema = "public", catalog = "galeriart")
public class VentaEntity {
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
        VentaEntity that = (VentaEntity) o;
        return idVenta == that.idVenta &&
                Objects.equals(fechaventa, that.fechaventa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVenta, fechaventa);
    }
}
