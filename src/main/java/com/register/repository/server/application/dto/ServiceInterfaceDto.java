package com.register.repository.server.application.dto;

import com.register.repository.server.domain.model.ApplicationComponent;
import com.register.repository.server.domain.model.Operation;

import java.util.Date;
import java.util.List;

public class ServiceInterfaceDto {

    private Long idServiceInterface;

    private String name;

    private String description;

    private Date timestamp;

    private List<Operation> operations;

    private ApplicationComponent applicationComponent;

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
}
