package com.register.repository.server.domain.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "applicationComponent")
public class ApplicationComponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApplicationComponent;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Basic(optional = false)
    @Column(name = "timestamp", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "applicationComponent")
    private List<ServiceInterface> serviceInterfaces;

    @ManyToOne
    private Application application;

    public ApplicationComponent() {
    }

    public ApplicationComponent(String name, String description, Application application, Date timestamp,
                                List<ServiceInterface> serviceInterfaces) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.application = application;
        this.serviceInterfaces = serviceInterfaces;
    }

    public ApplicationComponent(String name, String description, Date timestamp) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
    }

    public Long getIdApplicationComponent() {
        return idApplicationComponent;
    }

    public void setIdApplicationComponent(Long idApplicationComponent) {
        this.idApplicationComponent = idApplicationComponent;
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

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public List<ServiceInterface> getServiceInterfaces() {
        return serviceInterfaces;
    }

    public void setServiceInterfaces(List<ServiceInterface> serviceInterfaces) {
        this.serviceInterfaces = serviceInterfaces;
    }
    public void addService(ServiceInterface serviceInterface) {
        if (getServiceInterfaces()==null){
            this.serviceInterfaces = new ArrayList<>();
        }
        getServiceInterfaces().add(serviceInterface);
        serviceInterface.setApplicationComponent(this);
    }
    public void removeService(ServiceInterface serviceInterface){
        if (getServiceInterfaces()!=null) {
            getServiceInterfaces().remove(serviceInterface);
        }
    }
}
