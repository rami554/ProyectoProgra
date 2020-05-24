// Generated with g9.

package com.arte.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="venta")
public class Venta implements Serializable {

    /** Primary key. */
    protected static final String PK = "idVenta";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(name="id_venta", unique=true, nullable=false, precision=10)
    private int idVenta;
    @Column(nullable=false)
    private Date fechaventa;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_obra", nullable=false)
    private Obra obra;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_cliente", nullable=false)
    private Persona persona;

    /** Default constructor. */
    public Venta() {
        super();
    }

    /**
     * Access method for idVenta.
     *
     * @return the current value of idVenta
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * Setter method for idVenta.
     *
     * @param aIdVenta the new value for idVenta
     */
    public void setIdVenta(int aIdVenta) {
        idVenta = aIdVenta;
    }

    /**
     * Access method for fechaventa.
     *
     * @return the current value of fechaventa
     */
    public Date getFechaventa() {
        return fechaventa;
    }

    /**
     * Setter method for fechaventa.
     *
     * @param aFechaventa the new value for fechaventa
     */
    public void setFechaventa(Date aFechaventa) {
        fechaventa = aFechaventa;
    }

    /**
     * Access method for obra.
     *
     * @return the current value of obra
     */
    public Obra getObra() {
        return obra;
    }

    /**
     * Setter method for obra.
     *
     * @param aObra the new value for obra
     */
    public void setObra(Obra aObra) {
        obra = aObra;
    }

    /**
     * Access method for persona.
     *
     * @return the current value of persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Setter method for persona.
     *
     * @param aPersona the new value for persona
     */
    public void setPersona(Persona aPersona) {
        persona = aPersona;
    }

    /**
     * Compares the key for this instance with another Venta.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Venta and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Venta)) {
            return false;
        }
        Venta that = (Venta) other;
        if (this.getIdVenta() != that.getIdVenta()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Venta.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Venta)) return false;
        return this.equalKeys(other) && ((Venta)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getIdVenta();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Venta |");
        sb.append(" idVenta=").append(getIdVenta());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idVenta", Integer.valueOf(getIdVenta()));
        return ret;
    }

}
