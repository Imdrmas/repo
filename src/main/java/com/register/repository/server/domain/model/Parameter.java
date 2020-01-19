package com.register.repository.server.domain.model;

import javax.persistence.*;
import java.nio.file.OpenOption;
import java.sql.Timestamp;
import java.util.Date;

@Entity(name = "parameter")
public class Parameter  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idParameter;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Basic(optional = false)
    @Column(name = "timestamp", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @ManyToOne
    private Type type;

    @ManyToOne
    private Operation operation;

    public Parameter() {
    }

    public Parameter(String name, String description, Type type, Operation operation, Date timestamp) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.type = type;
        this.operation = operation;
    }

    public Parameter(String name, String description, Date timestamp) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
    }

    public Long getIdParameter() {
        return idParameter;
    }

    public void setIdParameter(Long idParameter) {
        this.idParameter = idParameter;
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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
