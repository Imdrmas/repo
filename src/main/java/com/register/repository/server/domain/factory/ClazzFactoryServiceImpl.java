package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Clazz;

import java.util.Date;

public class ClazzFactoryServiceImpl implements ClazzFactoryService {
    @Override
    public Clazz create() {
        return new Clazz();
    }

    @Override
    public Clazz create(String name, String description) {
        return new Clazz(name, description);
    }
}
