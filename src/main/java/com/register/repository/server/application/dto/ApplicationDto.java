package com.register.repository.server.application.dto;


import com.register.repository.server.domain.model.ApplicationComponent;
import com.register.repository.server.domain.model.Type;

import java.util.Date;
import java.util.List;

public class ApplicationDto {

    private Long idApplication;

    private String name;

    private String description;

    private Date timestamp;

    private List<ApplicationComponent> applicationComponents;

    private List<Type> types;

    public Long getIdApplication() {
        return idApplication;
    }

    public void setIdApplication(Long idApplication) {
        this.idApplication = idApplication;
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

    public List<ApplicationComponent> getApplicationComponents() {
        return applicationComponents;
    }

    public void setApplicationComponents(List<ApplicationComponent> applicationComponents) {
        this.applicationComponents = applicationComponents;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }
}
