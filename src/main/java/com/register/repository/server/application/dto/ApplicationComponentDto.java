package com.register.repository.server.application.dto;


import com.register.repository.server.domain.model.Application;
import com.register.repository.server.domain.model.ServiceInterface;

import java.util.Date;
import java.util.List;

public class ApplicationComponentDto {

    private Long idApplicationComponent;

    private String name;

    private String description;

    private Date timestamp;

    private List<ServiceInterface> serviceInterfaces;

    private Application application;

}
