package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Application;

import java.util.Date;

public class ApplicationFactoryServiceImpl implements ApplicationFactoryService {
    @Override
    public Application create() {
        return new Application();
    }

    @Override
    public Application create(String name, String description, Date timestamp) {
        return new Application(name, description, timestamp);
    }
}
