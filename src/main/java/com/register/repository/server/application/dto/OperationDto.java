package com.register.repository.server.application.dto;

import com.register.repository.server.domain.model.Parameter;
import com.register.repository.server.domain.model.ServiceInterface;

import java.util.Date;
import java.util.List;

public class OperationDto {

    private Long idOperation;

    private String name;

    private String description;

    private Date timestamp;

    private List<Parameter> parameters;

    private ServiceInterface serviceInterface;

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
}
