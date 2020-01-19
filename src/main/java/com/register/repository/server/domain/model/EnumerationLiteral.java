package com.register.repository.server.domain.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity(name = "enumerationLiteral")
public class EnumerationLiteral  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnumerationLiteral;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    private int multiple = 1;

    @Basic(optional = false)
    @Column(name = "timestamp", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @ManyToOne
    private Enumeration enumeration;

    public EnumerationLiteral() {
    }

    public EnumerationLiteral(String name, String description, Enumeration enumeration, Date timestamp, int multiple) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.enumeration = enumeration;
        this.multiple = multiple;
    }

    public EnumerationLiteral(String name, String description, Date timestamp, int multiple) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.multiple = multiple;
    }

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

    public int getMultiple() {
        return multiple;
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }
}
