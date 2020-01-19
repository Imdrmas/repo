package com.register.repository.server.domain.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "enumeration")
public class Enumeration extends Type {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "enumeration")
    private List<EnumerationLiteral> enumerationLiterals;

    public Enumeration() {
    }

    public Enumeration(String name, String description, List<EnumerationLiteral> enumerationLiterals) {
        this.name = name;
        this.description = description;
        this.enumerationLiterals = enumerationLiterals;
    }

    public Enumeration(String name, String description) {
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

    public List<EnumerationLiteral> getEnumerationLiterals() {
        return enumerationLiterals;
    }

    public void setEnumerationLiterals(List<EnumerationLiteral> enumerationLiterals) {
        this.enumerationLiterals = enumerationLiterals;
    }
    public void addLiteral(EnumerationLiteral literal) {
        if (getEnumerationLiterals()==null){
            this.enumerationLiterals = new ArrayList<>();
        }
        getEnumerationLiterals().add(literal);
        literal.setEnumeration(this);
    }
    public void removeLiteral(EnumerationLiteral literal) {
        if (getEnumerationLiterals()!=null) {
            getEnumerationLiterals().remove(literal);
        }
    }
}
