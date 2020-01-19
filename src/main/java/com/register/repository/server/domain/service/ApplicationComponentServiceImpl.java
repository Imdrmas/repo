package com.register.repository.server.domain.service;

import com.register.repository.server.domain.dao.ApplicationComponentDao;
import com.register.repository.server.domain.model.ApplicationComponent;
import com.register.repository.server.domain.model.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicationComponentServiceImpl implements ApplicationComponentService {

    @Autowired
    private final ApplicationComponentDao applicationComponentDao;

    public ApplicationComponentServiceImpl(ApplicationComponentDao applicationComponentDao) {
        this.applicationComponentDao = applicationComponentDao;
    }

    @Override
    public ApplicationComponent updateApplicationComponent(ApplicationComponent newApplicationComponent,
                                                           ApplicationComponent applicationComponentExist) {
        if (newApplicationComponent != null && applicationComponentExist!=null) {
          applicationComponentExist.setName(newApplicationComponent.getName());
          applicationComponentExist.setDescription(newApplicationComponent.getDescription());
          applicationComponentExist.setTimestamp(applicationComponentExist.getTimestamp());
         return applicationComponentDao.save(applicationComponentExist);
        } else {
            return  null;
        }
    }

    @Override
    public ServiceInterfaceService createServiceInterfaceService(ServiceInterface serviceInterface,
                                                                 ApplicationComponent applicationComponent) {
        if (applicationComponent!=null) {
            applicationComponent.addService(serviceInterface);
            applicationComponentDao.save(applicationComponent);
        }
        return null;
    }
}
