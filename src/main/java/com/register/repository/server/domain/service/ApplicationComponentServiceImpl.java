package com.register.repository.server.domain.service;

import com.register.repository.server.domain.dao.ApplicationComponentDao;
import com.register.repository.server.domain.model.Application;
import com.register.repository.server.domain.model.ApplicationComponent;
import com.register.repository.server.domain.model.ServiceInterface;
import com.register.repository.server.domain.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicationComponentServiceImpl {

    @Autowired
    private final ApplicationComponentDao applicationComponentDao;

    public ApplicationComponentServiceImpl(ApplicationComponentDao applicationComponentDao) {
        this.applicationComponentDao = applicationComponentDao;
    }

}
