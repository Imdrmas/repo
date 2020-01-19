package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Parameter;

import java.util.Date;

public class ParameterFactoryServiceImpl implements ParameterFactoryService {
    @Override
    public Parameter create() {
        return new Parameter();
    }

    @Override
    public Parameter create(String name, String description, Date timestamp) {
        return new Parameter(name, description, timestamp);
    }
}
