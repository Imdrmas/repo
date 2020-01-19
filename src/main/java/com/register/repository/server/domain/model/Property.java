package com.register.repository.server.domain.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity(name = "property")
public class Property  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProperty;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Basic(optional = false)
    @Column(name = "timestamp", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @ManyToOne
    private Clazz clazz;

    public Property() {
    }

    public Property(String name, String description, Clazz clazz, Date timestamp) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.clazz = clazz;
    }

    public Property(String name, String description, Date timestamp) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
    }

    public Long getIdProperty() {
        return idProperty;
    }

    public void setIdProperty(Long idProperty) {
        this.idProperty = idProperty;
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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }
}
