package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Enumeration;

public class EnumerationFactoryServiceImpl implements EnumerationFactoryService {
    @Override
    public Enumeration create() {
        return new Enumeration();
    }

    @Override
    public Enumeration create(String name, String description) {
        return new Enumeration(name, description);
    }
}
