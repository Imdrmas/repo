package com.register.repository.server.application.dto;

import com.register.repository.server.domain.model.Operation;
import com.register.repository.server.domain.model.Type;

import java.util.Date;

public class ParameterDto {

    private Long idParameter;

    private String name;

    private String description;

    private Date timestamp;

    private Type type;

    private Operation operation;

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

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
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
