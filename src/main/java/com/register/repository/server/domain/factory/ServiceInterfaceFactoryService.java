package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.ServiceInterface;

import java.util.Date;

public interface ServiceInterfaceFactoryService {

    ServiceInterface create();

    ServiceInterface create(String name, String description, Date timestamp);
}
