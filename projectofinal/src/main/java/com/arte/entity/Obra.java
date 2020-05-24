// Generated with g9.

package com.arte.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="obra")
public class Obra implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "idObra";

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
    @Column(name="id_obra", unique=true, nullable=false, precision=10)
    private int idObra;
    @Column(length=50)
    private String titulo;
    @Column(length=50)
    private String estilo;
    @Column(nullable=false, precision=8, scale=8)
    private float precio;
    @Column(name="id_artista", nullable=false, precision=10)
    private int idArtista;
    @OneToMany(mappedBy="obra")
    private Set<Obraexpo> obraexpo;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_propietario", nullable=false)
    private Persona persona;
    @OneToMany(mappedBy="obra")
    private Set<Venta> venta;

    /** Default constructor. */
    public Obra() {
        super();
    }

    /**
     * Access method for idObra.
     *
     * @return the current value of idObra
     */
    public int getIdObra() {
        return idObra;
    }

    /**
     * Setter method for idObra.
     *
     * @param aIdObra the new value for idObra
     */
    public void setIdObra(int aIdObra) {
        idObra = aIdObra;
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
     * Access method for estilo.
     *
     * @return the current value of estilo
     */
    public String getEstilo() {
        return estilo;
    }

    /**
     * Setter method for estilo.
     *
     * @param aEstilo the new value for estilo
     */
    public void setEstilo(String aEstilo) {
        estilo = aEstilo;
    }

    /**
     * Access method for precio.
     *
     * @return the current value of precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Setter method for precio.
     *
     * @param aPrecio the new value for precio
     */
    public void setPrecio(float aPrecio) {
        precio = aPrecio;
    }

    /**
     * Access method for idArtista.
     *
     * @return the current value of idArtista
     */
    public int getIdArtista() {
        return idArtista;
    }

    /**
     * Setter method for idArtista.
     *
     * @param aIdArtista the new value for idArtista
     */
    public void setIdArtista(int aIdArtista) {
        idArtista = aIdArtista;
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
     * Compares the key for this instance with another Obra.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Obra and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Obra)) {
            return false;
        }
        Obra that = (Obra) other;
        if (this.getIdObra() != that.getIdObra()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Obra.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Obra)) return false;
        return this.equalKeys(other) && ((Obra)other).equalKeys(this);
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
        i = getIdObra();
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
        StringBuffer sb = new StringBuffer("[Obra |");
        sb.append(" idObra=").append(getIdObra());
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
        ret.put("idObra", Integer.valueOf(getIdObra()));
        return ret;
    }

}
