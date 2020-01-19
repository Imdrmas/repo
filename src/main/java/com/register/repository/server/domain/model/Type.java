package com.register.repository.server.domain.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "type")
public class Type  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idType;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    private boolean deletable;

    @Basic(optional = false)
    @Column(name = "timestamp", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @ManyToOne
    private Application application;

    public Type() {
    }

    public Type(String name, String description, Date timestamp, boolean deletable) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
    }

    public Type(String name, String description, boolean deletable) {
        this.name = name;
        this.description = description;
        this.deletable = deletable;
    }
    public Type(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getIdType() {
        return idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
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

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isDeletable() {
        return deletable;
    }

    public void setDeletable(boolean deletable) {
        this.deletable = deletable;
    }
}
