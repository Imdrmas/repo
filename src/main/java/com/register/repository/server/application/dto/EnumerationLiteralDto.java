package com.register.repository.server.application.dto;

import com.register.repository.server.domain.model.Enumeration;

import java.util.Date;

public class EnumerationLiteralDto {

    private Long idEnumerationLiteral;

    private String name;

    private String description;

    private int multiple = 1;

    private Date timestamp;

    private Enumeration enumeration;

    public Long getIdEnumerationLiteral() {
        return idEnumerationLiteral;
    }

    public void setIdEnumerationLiteral(Long idEnumerationLiteral) {
        this.idEnumerationLiteral = idEnumerationLiteral;
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

    public int getMultiple() {
        return multiple;
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Enumeration getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
    }
}
