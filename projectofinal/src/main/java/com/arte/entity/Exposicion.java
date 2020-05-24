// Generated with g9.

package com.arte.entity;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="exposicion")
public class Exposicion implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "ExposicionExposicionPk";

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

    @Column(name="id_exposicion", nullable=false, precision=10)
    private int idExposicion;
    @Column(nullable=false, length=50)
    private String titulo;
    @Column(nullable=false, length=250)
    private String descripcion;
    @Column(nullable=false)
    private Date fechainauguracion;
    @Column(nullable=false)
    private Date fechaclausura;
    @Column(nullable=false, length=2)
    private String salon1;
    @Column(nullable=false, length=2)
    private String salon2;
    @Column(nullable=false, length=2)
    private String salon3;
    @OneToMany(mappedBy="exposicion")
    private Set<Obraexpo> obraexpo;
    @OneToMany(mappedBy="exposicion2")
    private Set<Obraexpo> obraexpo2;
    @OneToMany(mappedBy="exposicion3")
    private Set<Obraexpo> obraexpo3;
    @OneToMany(mappedBy="exposicion4")
    private Set<Obraexpo> obraexpo4;
    @OneToMany(mappedBy="exposicion5")
    private Set<Obraexpo> obraexpo5;

    /** Default constructor. */
    public Exposicion() {
        super();
    }

    /**
     * Access method for idExposicion.
     *
     * @return the current value of idExposicion
     */
    public int getIdExposicion() {
        return idExposicion;
    }

    /**
     * Setter method for idExposicion.
     *
     * @param aIdExposicion the new value for idExposicion
     */
    public void setIdExposicion(int aIdExposicion) {
        idExposicion = aIdExposicion;
    }

    /**
     * Access method for titulo.
     *
     * @return the current value of titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter method for titulo.
     *
     * @param aTitulo the new value for titulo
     */
    public void setTitulo(String aTitulo) {
        titulo = aTitulo;
    }

    /**
     * Access method for descripcion.
     *
     * @return the current value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter method for descripcion.
     *
     * @param aDescripcion the new value for descripcion
     */
    public void setDescripcion(String aDescripcion) {
        descripcion = aDescripcion;
    }

    /**
     * Access method for fechainauguracion.
     *
     * @return the current value of fechainauguracion
     */
    public Date getFechainauguracion() {
        return fechainauguracion;
    }

    /**
     * Setter method for fechainauguracion.
     *
     * @param aFechainauguracion the new value for fechainauguracion
     */
    public void setFechainauguracion(Date aFechainauguracion) {
        fechainauguracion = aFechainauguracion;
    }

    /**
     * Access method for fechaclausura.
     *
     * @return the current value of fechaclausura
     */
    public Date getFechaclausura() {
        return fechaclausura;
    }

    /**
     * Setter method for fechaclausura.
     *
     * @param aFechaclausura the new value for fechaclausura
     */
    public void setFechaclausura(Date aFechaclausura) {
        fechaclausura = aFechaclausura;
    }

    /**
     * Access method for salon1.
     *
     * @return the current value of salon1
     */
    public String getSalon1() {
        return salon1;
    }

    /**
     * Setter method for salon1.
     *
     * @param aSalon1 the new value for salon1
     */
    public void setSalon1(String aSalon1) {
        salon1 = aSalon1;
    }

    /**
     * Access method for salon2.
     *
     * @return the current value of salon2
     */
    public String getSalon2() {
        return salon2;
    }

    /**
     * Setter method for salon2.
     *
     * @param aSalon2 the new value for salon2
     */
    public void setSalon2(String aSalon2) {
        salon2 = aSalon2;
    }

    /**
     * Access method for salon3.
     *
     * @return the current value of salon3
     */
    public String getSalon3() {
        return salon3;
    }

    /**
     * Setter method for salon3.
     *
     * @param aSalon3 the new value for salon3
     */
    public void setSalon3(String aSalon3) {
        salon3 = aSalon3;
    }

    /**
     * Access method for obraexpo.
     *
     * @return the current value of obraexpo
     */
    public Set<Obraexpo> getObraexpo() {
        return obraexpo;
    }

    /**
     * Setter method for obraexpo.
     *
     * @param aObraexpo the new value for obraexpo
     */
    public void setObraexpo(Set<Obraexpo> aObraexpo) {
        obraexpo = aObraexpo;
    }

    /**
     * Access method for obraexpo2.
     *
     * @return the current value of obraexpo2
     */
    public Set<Obraexpo> getObraexpo2() {
        return obraexpo2;
    }

    /**
     * Setter method for obraexpo2.
     *
     * @param aObraexpo2 the new value for obraexpo2
     */
    public void setObraexpo2(Set<Obraexpo> aObraexpo2) {
        obraexpo2 = aObraexpo2;
    }

    /**
     * Access method for obraexpo3.
     *
     * @return the current value of obraexpo3
     */
    public Set<Obraexpo> getObraexpo3() {
        return obraexpo3;
    }

    /**
     * Setter method for obraexpo3.
     *
     * @param aObraexpo3 the new value for obraexpo3
     */
    public void setObraexpo3(Set<Obraexpo> aObraexpo3) {
        obraexpo3 = aObraexpo3;
    }

    /**
     * Access method for obraexpo4.
     *
     * @return the current value of obraexpo4
     */
    public Set<Obraexpo> getObraexpo4() {
        return obraexpo4;
    }

    /**
     * Setter method for obraexpo4.
     *
     * @param aObraexpo4 the new value for obraexpo4
     */
    public void setObraexpo4(Set<Obraexpo> aObraexpo4) {
        obraexpo4 = aObraexpo4;
    }

    /**
     * Access method for obraexpo5.
     *
     * @return the current value of obraexpo5
     */
    public Set<Obraexpo> getObraexpo5() {
        return obraexpo5;
    }

    /**
     * Setter method for obraexpo5.
     *
     * @param aObraexpo5 the new value for obraexpo5
     */
    public void setObraexpo5(Set<Obraexpo> aObraexpo5) {
        obraexpo5 = aObraexpo5;
    }

    /**
     * Compares the key for this instance with another Exposicion.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Exposicion and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Exposicion)) {
            return false;
        }
        Exposicion that = (Exposicion) other;
        if (this.getIdExposicion() != that.getIdExposicion()) {
            return false;
        }
        Object myFechainauguracion = this.getFechainauguracion();
        Object yourFechainauguracion = that.getFechainauguracion();
        if (myFechainauguracion==null ? yourFechainauguracion!=null : !myFechainauguracion.equals(yourFechainauguracion)) {
            return false;
        }
        Object mySalon1 = this.getSalon1();
        Object yourSalon1 = that.getSalon1();
        if (mySalon1==null ? yourSalon1!=null : !mySalon1.equals(yourSalon1)) {
            return false;
        }
        Object mySalon2 = this.getSalon2();
        Object yourSalon2 = that.getSalon2();
        if (mySalon2==null ? yourSalon2!=null : !mySalon2.equals(yourSalon2)) {
            return false;
        }
        Object mySalon3 = this.getSalon3();
        Object yourSalon3 = that.getSalon3();
        if (mySalon3==null ? yourSalon3!=null : !mySalon3.equals(yourSalon3)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Exposicion.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Exposicion)) return false;
        return this.equalKeys(other) && ((Exposicion)other).equalKeys(this);
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
        i = getIdExposicion();
        result = 37*result + i;
        if (getFechainauguracion() == null) {
            i = 0;
        } else {
            i = getFechainauguracion().hashCode();
        }
        result = 37*result + i;
        if (getSalon1() == null) {
            i = 0;
        } else {
            i = getSalon1().hashCode();
        }
        result = 37*result + i;
        if (getSalon2() == null) {
            i = 0;
        } else {
            i = getSalon2().hashCode();
        }
        result = 37*result + i;
        if (getSalon3() == null) {
            i = 0;
        } else {
            i = getSalon3().hashCode();
        }
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
        StringBuffer sb = new StringBuffer("[Exposicion |");
        SimpleDateFormat sdf = null;
        sb.append(" idExposicion=").append(getIdExposicion());
        sdf = new SimpleDateFormat("yyyyMMdd");
        sb.append(" fechainauguracion=").append(getFechainauguracion()!=null ? sdf.format(getFechainauguracion()) : null);
        sb.append(" salon1=").append(getSalon1());
        sb.append(" salon2=").append(getSalon2());
        sb.append(" salon3=").append(getSalon3());
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
        ret.put("idExposicion", Integer.valueOf(getIdExposicion()));
        ret.put("fechainauguracion", getFechainauguracion());
        ret.put("salon1", getSalon1());
        ret.put("salon2", getSalon2());
        ret.put("salon3", getSalon3());
        return ret;
    }

}
