package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Property;

import java.util.Date;

public interface PropertyFactoryService {

    Property create();

    Property create(String name, String description, Date timestamp);
}
