// Generated with g9.

package com.arte.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="persona")
public class Persona implements Serializable {

    /** Primary key. */
    protected static final String PK = "idPersona";

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
    @Column(name="id_persona", unique=true, nullable=false, precision=10)
    private int idPersona;
    @Column(nullable=false, length=75)
    private String nombre;
    @Column(nullable=false, length=50)
    private String apellido;
    @Column(nullable=false, precision=10)
    private int celular;
    @Column(nullable=false, length=20)
    private String pais;
    @Column(nullable=false, length=20)
    private String ciudad;
    @Column(nullable=false, length=50)
    private String profesion;
    @OneToMany(mappedBy="persona")
    private Set<Obra> obra;
    @OneToMany(mappedBy="persona")
    private Set<Venta> venta;

    /** Default constructor. */
    public Persona() {
        super();
    }

    /**
     * Access method for idPersona.
     *
     * @return the current value of idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * Setter method for idPersona.
     *
     * @param aIdPersona the new value for idPersona
     */
    public void setIdPersona(int aIdPersona) {
        idPersona = aIdPersona;
    }

    /**
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Access method for apellido.
     *
     * @return the current value of apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Setter method for apellido.
     *
     * @param aApellido the new value for apellido
     */
    public void setApellido(String aApellido) {
        apellido = aApellido;
    }

    /**
     * Access method for celular.
     *
     * @return the current value of celular
     */
    public int getCelular() {
        return celular;
    }

    /**
     * Setter method for celular.
     *
     * @param aCelular the new value for celular
     */
    public void setCelular(int aCelular) {
        celular = aCelular;
    }

    /**
     * Access method for pais.
     *
     * @return the current value of pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Setter method for pais.
     *
     * @param aPais the new value for pais
     */
    public void setPais(String aPais) {
        pais = aPais;
    }

    /**
     * Access method for ciudad.
     *
     * @return the current value of ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Setter method for ciudad.
     *
     * @param aCiudad the new value for ciudad
     */
    public void setCiudad(String aCiudad) {
        ciudad = aCiudad;
    }

    /**
     * Access method for profesion.
     *
     * @return the current value of profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Setter method for profesion.
     *
     * @param aProfesion the new value for profesion
     */
    public void setProfesion(String aProfesion) {
        profesion = aProfesion;
    }

    /**
     * Access method for obra.
     *
     * @return the current value of obra
     */
    public Set<Obra> getObra() {
        return obra;
    }

    /**
     * Setter method for obra.
     *
     * @param aObra the new value for obra
     */
    public void setObra(Set<Obra> aObra) {
        obra = aObra;
    }

    /**
     * Access method for venta.
     *
     * @return the current value of venta
     */
    public Set<Venta> getVenta() {
        return venta;
    }

    /**
     * Setter method for venta.
     *
     * @param aVenta the new value for venta
     */
    public void setVenta(Set<Venta> aVenta) {
        venta = aVenta;
    }

    /**
     * Compares the key for this instance with another Persona.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Persona and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Persona)) {
            return false;
        }
        Persona that = (Persona) other;
        if (this.getIdPersona() != that.getIdPersona()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Persona.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Persona)) return false;
        return this.equalKeys(other) && ((Persona)other).equalKeys(this);
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
        i = getIdPersona();
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
        StringBuffer sb = new StringBuffer("[Persona |");
        sb.append(" idPersona=").append(getIdPersona());
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
        ret.put("idPersona", Integer.valueOf(getIdPersona()));
        return ret;
    }

}
