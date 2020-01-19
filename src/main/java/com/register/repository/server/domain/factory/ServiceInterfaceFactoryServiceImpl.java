package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.ServiceInterface;

import java.util.Date;

public class ServiceInterfaceFactoryServiceImpl implements ServiceInterfaceFactoryService {
    @Override
    public ServiceInterface create() {
        return new ServiceInterface();
    }

    @Override
    public ServiceInterface create(String name, String description, Date timestamp) {
        return new ServiceInterface(name, description, timestamp);
    }
}
