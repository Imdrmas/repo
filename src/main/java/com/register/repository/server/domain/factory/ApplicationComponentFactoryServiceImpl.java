package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.ApplicationComponent;

import java.util.Date;

public class ApplicationComponentFactoryServiceImpl implements  ApplicationComponentFactoryService {
    @Override
    public ApplicationComponent create() {
        return new ApplicationComponent();
    }

    @Override
    public ApplicationComponent create(String name, String description, Date timestamp) {
        return new ApplicationComponent(name, description, timestamp);
    }
}
