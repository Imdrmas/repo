package com.register.repository.server.domain.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "clazz")
public class Clazz extends Type {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    private Clazz clazz;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "clazz")
    private List<Property> properties;

    public Clazz() {
    }

    public Clazz(String name, String description, Clazz clazz, List<Property> properties) {
        this.name = name;
        this.description = description;
        this.clazz = clazz;
        this.properties = properties;
    }

    public Clazz(String name, String description) {
        super(name, description);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public void addProperty(Property property) {
        if (getProperties()==null) {
            this.properties = new ArrayList<>();
        }
        getProperties().add(property);
        property.setClazz(this);
    }
    public void removeProperty(Property property) {
        if (getProperties()!=null){
            getProperties().remove(property);
        }
    }
}
