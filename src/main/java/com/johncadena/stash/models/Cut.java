package com.johncadena.stash.models;

import javax.persistence.*;

@Entity
@Table(name="cuts")
public class Cut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "stash_id")
    private Stash stash;

    @Column(nullable = false)
    private String fabricName;

    @Column(nullable = false)
    private double quantity;

    @Column(length = 500)
    private String description;

    @Column(length = 100)
    private String line;

    @Column(length = 100)
    private String brand;

    @Column(length = 100)
    private String designer;

    //stash_id
    //type (yardage, fat quarter, layer cake, charm pack, jelly roll,
    //image (optional)

    public Cut() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Stash getStash() {
        return stash;
    }

    public void setStash(Stash stash) {
        this.stash = stash;
    }

    public String getFabricName() {
        return fabricName;
    }

    public void setFabricName(String fabricName) {
        this.fabricName = fabricName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }
}
