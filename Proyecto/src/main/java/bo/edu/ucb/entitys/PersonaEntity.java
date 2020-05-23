package bo.edu.ucb.entitys;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "persona", schema = "public", catalog = "galeriart")
public class PersonaEntity {
    private int idPersona;
    private String nombre;
    private String apellido;
    private int celular;
    private String pais;
    private String ciudad;
    private String profesion;

    @Id
    @Column(name = "id_persona")
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellido")
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Basic
    @Column(name = "celular")
    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "pais")
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Basic
    @Column(name = "ciudad")
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Basic
    @Column(name = "profesion")
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaEntity that = (PersonaEntity) o;
        return idPersona == that.idPersona &&
                celular == that.celular &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(apellido, that.apellido) &&
                Objects.equals(pais, that.pais) &&
                Objects.equals(ciudad, that.ciudad) &&
                Objects.equals(profesion, that.profesion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersona, nombre, apellido, celular, pais, ciudad, profesion);
    }
}
