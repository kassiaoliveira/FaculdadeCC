package com.unifg.girah.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "CARGO")
public class RoleEntity {

    @Id
    @Column(name="IDCARGO")
    private Integer idCargo;

    @Column(name="NOMECARGO")
    private String nome;

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleEntity)) return false;
        RoleEntity that = (RoleEntity) o;
        return Objects.equals(getIdCargo(), that.getIdCargo()) &&
                Objects.equals(getNome(), that.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdCargo(), getNome());
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
