package com.arte.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Obraexpo {
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
        Obraexpo obraexpo = (Obraexpo) o;
        return idObraexpo == obraexpo.idObraexpo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObraexpo);
    }
}
