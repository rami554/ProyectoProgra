package bo.edu.ucb.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "obraexpo", schema = "public", catalog = "galeriart")
public class ObraexpoEntity {
    private int idObraexpo;

    @Id
    @Column(name = "id_obraexpo")
    public int getIdObraexpo() {
        return idObraexpo;
    }

    public void setIdObraexpo(int idObraexpo) {
        this.idObraexpo = idObraexpo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObraexpoEntity that = (ObraexpoEntity) o;
        return idObraexpo == that.idObraexpo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObraexpo);
    }
}
