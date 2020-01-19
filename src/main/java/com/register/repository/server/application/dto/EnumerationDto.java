package com.register.repository.server.application.dto;

import com.register.repository.server.domain.model.EnumerationLiteral;
import com.register.repository.server.domain.model.Type;

import java.util.List;

public class EnumerationDto extends Type {

    private String name;

    private String description;

    private List<EnumerationLiteral> enumerationLiterals;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public List<EnumerationLiteral> getEnumerationLiterals() {
        return enumerationLiterals;
    }

    public void setEnumerationLiterals(List<EnumerationLiteral> enumerationLiterals) {
        this.enumerationLiterals = enumerationLiterals;
    }
}
