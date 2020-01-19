package com.register.repository.server.infrastructure.config;

import com.register.repository.server.domain.dao.ApplicationDao;
import com.register.repository.server.domain.factory.*;
import com.register.repository.server.domain.model.Application;
import com.register.repository.server.domain.model.ApplicationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class DateBaseInit {
/*
    private final ApplicationDao applicationDao;

    private final ApplicationFactoryService applicationFactoryService;

    private final ApplicationComponentFactoryService applicationComponentFactoryService;

    private final ClazzFactoryService clazzFactoryService;

    private final EnumerationFactoryService enumerationFactoryService;

    private final EnumerationLiteralFactoryService enumerationLiteralFactoryService;

    private final OperationFactoryService operationFactoryService;

    private final ParameterFactoryService parameterFactoryService;

    private final PropertyFactoryService propertyFactoryService;

    private final ServiceInterfaceFactoryService serviceInterfaceFactoryService;

    private final TypeFactoryService typeFactoryService;

    @Autowired
    public DateBaseInit(ApplicationDao applicationDao, ApplicationComponentFactoryService
            applicationComponentFactoryService, ClazzFactoryService clazzFactoryService,
                        EnumerationFactoryService enumerationFactoryService,
                        EnumerationLiteralFactoryService enumerationLiteralFactoryService,
                        OperationFactoryService operationFactoryService, ParameterFactoryService
                                parameterFactoryService, PropertyFactoryService
                                propertyFactoryService, ServiceInterfaceFactoryService serviceInterfaceFactoryService,
                        TypeFactoryService typeFactoryService, ApplicationFactoryService applicationFactoryService) {
        this.applicationDao = applicationDao;
        this.applicationComponentFactoryService = applicationComponentFactoryService;
        this.clazzFactoryService = clazzFactoryService;
        this.enumerationFactoryService = enumerationFactoryService;
        this.enumerationLiteralFactoryService = enumerationLiteralFactoryService;
        this.operationFactoryService = operationFactoryService;
        this.parameterFactoryService = parameterFactoryService;
        this.propertyFactoryService = propertyFactoryService;
        this.serviceInterfaceFactoryService = serviceInterfaceFactoryService;
        this.typeFactoryService = typeFactoryService;
        this.applicationFactoryService = applicationFactoryService;
    }

    public void init() {
        applicationDao.deleteAll();
        List<Application> apps = applicationDao.findAll();
        if (apps == null || apps.isEmpty()) {
            Application app = applicationFactoryService.create("Ismet", "Description", new Date());
            ApplicationComponent ismetServer =  applicationComponentFactoryService.create(
                    "Ismet server", "description", new Date());

        }
    }

 */
}
