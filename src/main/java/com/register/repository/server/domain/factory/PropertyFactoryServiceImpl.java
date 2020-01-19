package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Property;

import java.util.Date;

public class PropertyFactoryServiceImpl implements PropertyFactoryService {
    @Override
    public Property create() {
        return new Property();
    }

    @Override
    public Property create(String name, String description, Date timestamp) {
        return new Property(name, description, timestamp);
    }
}
