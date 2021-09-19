package com.unifg.girah.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="EQUIPE")
public class TeamEntity {

    @Id
    @Column(name = "CODEQUIPE")
    private Integer code;

    @Column(name = "NOMEEQUIPE")
    private String name;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamEntity)) return false;
        TeamEntity equipe = (TeamEntity) o;
        return Objects.equals(getCode(), equipe.getCode()) &&
                Objects.equals(getName(), equipe.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getName());
    }

    @Override
    public String toString() {
        return  this.name;
    }
}
