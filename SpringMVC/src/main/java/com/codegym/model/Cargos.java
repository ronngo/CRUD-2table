package com.codegym.model;


import javax.persistence.*;

@Entity
@Table(name = "cargos")
public class Cargos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private int price;
    private String description;
    private String date;
    private Long transitcarId;


    @ManyToOne
    @JoinColumn(name = "class_id")
    private Transitcar transitcar;

    public Cargos() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getTransitcarId() {
        return transitcarId;
    }

    public void setTransitcarId(Long transitcarId) {
        this.transitcarId = transitcarId;
    }

    public Transitcar getTransitcar() {
        return transitcar;
    }

    public void setTransitcar(Transitcar transitcar) {
        this.transitcar = transitcar;
    }
}
