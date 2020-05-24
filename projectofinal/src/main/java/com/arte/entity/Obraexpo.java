// Generated with g9.

package com.arte.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="obraexpo")
public class Obraexpo implements Serializable {

    /** Primary key. */
    protected static final String PK = "idObraexpo";

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
    @Column(name="id_obraexpo", unique=true, nullable=false, precision=10)
    private int idObraexpo;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_exposicion", nullable=false)
    private Exposicion exposicion;
    @ManyToOne(optional=false)
    @JoinColumn(name="exposicion_fechainauguracion", nullable=false)
    private Exposicion exposicion2;
    @ManyToOne(optional=false)
    @JoinColumn(name="exposicion_salon1", nullable=false)
    private Exposicion exposicion3;
    @ManyToOne(optional=false)
    @JoinColumn(name="exposicion_salon2", nullable=false)
    private Exposicion exposicion4;
    @ManyToOne(optional=false)
    @JoinColumn(name="exposicion_salon3", nullable=false)
    private Exposicion exposicion5;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_obra", nullable=false)
    private Obra obra;

    /** Default constructor. */
    public Obraexpo() {
        super();
    }

    /**
     * Access method for idObraexpo.
     *
     * @return the current value of idObraexpo
     */
    public int getIdObraexpo() {
        return idObraexpo;
    }

    /**
     * Setter method for idObraexpo.
     *
     * @param aIdObraexpo the new value for idObraexpo
     */
    public void setIdObraexpo(int aIdObraexpo) {
        idObraexpo = aIdObraexpo;
    }

    /**
     * Access method for exposicion.
     *
     * @return the current value of exposicion
     */
    public Exposicion getExposicion() {
        return exposicion;
    }

    /**
     * Setter method for exposicion.
     *
     * @param aExposicion the new value for exposicion
     */
    public void setExposicion(Exposicion aExposicion) {
        exposicion = aExposicion;
    }

    /**
     * Access method for exposicion2.
     *
     * @return the current value of exposicion2
     */
    public Exposicion getExposicion2() {
        return exposicion2;
    }

    /**
     * Setter method for exposicion2.
     *
     * @param aExposicion2 the new value for exposicion2
     */
    public void setExposicion2(Exposicion aExposicion2) {
        exposicion2 = aExposicion2;
    }

    /**
     * Access method for exposicion3.
     *
     * @return the current value of exposicion3
     */
    public Exposicion getExposicion3() {
        return exposicion3;
    }

    /**
     * Setter method for exposicion3.
     *
     * @param aExposicion3 the new value for exposicion3
     */
    public void setExposicion3(Exposicion aExposicion3) {
        exposicion3 = aExposicion3;
    }

    /**
     * Access method for exposicion4.
     *
     * @return the current value of exposicion4
     */
    public Exposicion getExposicion4() {
        return exposicion4;
    }

    /**
     * Setter method for exposicion4.
     *
     * @param aExposicion4 the new value for exposicion4
     */
    public void setExposicion4(Exposicion aExposicion4) {
        exposicion4 = aExposicion4;
    }

    /**
     * Access method for exposicion5.
     *
     * @return the current value of exposicion5
     */
    public Exposicion getExposicion5() {
        return exposicion5;
    }

    /**
     * Setter method for exposicion5.
     *
     * @param aExposicion5 the new value for exposicion5
     */
    public void setExposicion5(Exposicion aExposicion5) {
        exposicion5 = aExposicion5;
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
     * Compares the key for this instance with another Obraexpo.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Obraexpo and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Obraexpo)) {
            return false;
        }
        Obraexpo that = (Obraexpo) other;
        if (this.getIdObraexpo() != that.getIdObraexpo()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Obraexpo.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Obraexpo)) return false;
        return this.equalKeys(other) && ((Obraexpo)other).equalKeys(this);
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
        i = getIdObraexpo();
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
        StringBuffer sb = new StringBuffer("[Obraexpo |");
        sb.append(" idObraexpo=").append(getIdObraexpo());
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
        ret.put("idObraexpo", Integer.valueOf(getIdObraexpo()));
        return ret;
    }

}
