package com.codegym.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "transitcars")
public class Transitcar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "transitcar")
    private Set<Cargos> cargos;

    public Transitcar() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Cargos> getCargos() {
        return cargos;
    }

    public void setCargos(Set<Cargos> cargos) {
        this.cargos = cargos;
    }
}
