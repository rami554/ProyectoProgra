package bo.edu.ucb.entitys;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "obra", schema = "public", catalog = "galeriart")
public class ObraEntity {
    private int idObra;
    private String titulo;
    private String estilo;
    private float precio;
    private int idArtista;

    @Id
    @Column(name = "id_obra")
    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    @Basic
    @Column(name = "titulo")
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Basic
    @Column(name = "estilo")
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Basic
    @Column(name = "precio")
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Basic
    @Column(name = "id_artista")
    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObraEntity that = (ObraEntity) o;
        return idObra == that.idObra &&
                Float.compare(that.precio, precio) == 0 &&
                idArtista == that.idArtista &&
                Objects.equals(titulo, that.titulo) &&
                Objects.equals(estilo, that.estilo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObra, titulo, estilo, precio, idArtista);
    }
}
