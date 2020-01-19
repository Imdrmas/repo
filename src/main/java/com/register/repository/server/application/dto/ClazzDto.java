package com.register.repository.server.application.dto;


import com.register.repository.server.domain.model.Property;
import com.register.repository.server.domain.model.Type;

import java.util.List;

public class ClazzDto extends Type {

    private String name;

    private String description;

    private ClazzDto clazz;

    private List<Property> properties;

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

    public ClazzDto getClazz() {
        return clazz;
    }

    public void setClazz(ClazzDto clazz) {
        this.clazz = clazz;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
