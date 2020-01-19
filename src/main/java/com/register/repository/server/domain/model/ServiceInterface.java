package com.register.repository.server.domain.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "serviceInterface")
public class ServiceInterface  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServiceInterface;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Basic(optional = false)
    @Column(name = "timestamp", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "serviceInterface")
    private List<Operation> operations;

    @ManyToOne
    private ApplicationComponent applicationComponent;

    public ServiceInterface() {
    }

    public ServiceInterface(String name, String description, List<Operation> operations, Date timestamp,
                            ApplicationComponent applicationComponent) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.operations = operations;
        this.applicationComponent = applicationComponent;
    }

    public ServiceInterface(String name, String description, Date timestamp) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
    }

    public Long getIdServiceInterface() {
        return idServiceInterface;
    }

    public void setIdServiceInterface(Long idServiceInterface) {
        this.idServiceInterface = idServiceInterface;
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

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public void setApplicationComponent(ApplicationComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }
    public void addOperation(Operation operation) {
        if (getOperations()==null){
            this.operations = new ArrayList<>();
        }
        getOperations().add(operation);
        operation.setServiceInterface(this);
    }

    public void removeOperation(Operation operation) {
        if (getOperations()!=null) {
            getOperations().remove(operation);
        }
    }
}
