package com.blog.blog.pets.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "chew_toys")
public class ChewToy implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String brand;

    @Column(name = "is_destroyed")
    private boolean destroyed;

    private String description;

    // add relationships, constructors, getters and setters...


    public ChewToy(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
