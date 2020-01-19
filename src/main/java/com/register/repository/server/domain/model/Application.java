package com.register.repository.server.domain.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "application")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApplication;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "description")
    @Size(max = 4000)
    private String description;

    @Basic(optional = false)
    @Column(name = "timestamp", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "application")
    private List<ApplicationComponent> applicationComponents;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "application")
    private List<Type> types;

    public Application() {
    }

    public Application(String name, @Size(max = 4000) String description,
                       List<ApplicationComponent> applicationComponents, List<Type> types, Date timestamp) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.applicationComponents = applicationComponents;
        this.types = types;
    }

    public Application(String name, @Size(max = 4000) String description, Date timestamp) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
    }

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

    public void addType(Type type) {
        if (getTypes()==null){
            this.types = new ArrayList<>();
        }
        getTypes().add(type);
        type.setApplication(this);
    }
    public void addComponent(ApplicationComponent component) {
        if (getApplicationComponents()==null) {
            this.applicationComponents = new ArrayList<>();
        }
        getApplicationComponents().add(component);
        component.setApplication(this);
    }
    public void removeType(Type type) {
        if (getTypes()!=null) {
            getTypes().remove(type);
        }
    }
    public void removeComponent(ApplicationComponent component) {
        if (getApplicationComponents()!=null) {
            getApplicationComponents().remove(component);
        }
    }
}
