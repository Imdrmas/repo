package com.register.repository.server.domain.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity(name = "operation")
public class Operation  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOperation;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Basic(optional = false)
    @Column(name = "timestamp", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "operation")
    private List<Parameter> parameters;

    @ManyToOne
    private ServiceInterface serviceInterface;

    public Operation() {
    }

    public Operation(String name, String description, List<Parameter> parameters, ServiceInterface serviceInterface,
                     Date timestamp) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.parameters = parameters;
        this.serviceInterface = serviceInterface;
    }

    public Operation(String name, String description, Date timestamp) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
    }

    public Long getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(Long idOperation) {
        this.idOperation = idOperation;
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

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public ServiceInterface getServiceInterface() {
        return serviceInterface;
    }

    public void setServiceInterface(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    public void addParameter(Parameter parameter) {
        if (getParameters()==null){
            getParameters().add(parameter);
        }
        getParameters().add(parameter);
        parameter.setOperation(this);
    }

    public void removeParameter(Parameter parameter) {
        if (getParameters()!=null) {
            getParameters().remove(parameter);
        }
    }
}
