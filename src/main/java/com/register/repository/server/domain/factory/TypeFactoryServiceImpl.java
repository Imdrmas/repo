package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Type;

import java.util.Date;

public class TypeFactoryServiceImpl implements TypeFactoryService {
    @Override
    public Type create() {
        return new Type();
    }

    @Override
    public Type create(String name, String description, Date timestamp, boolean deletable) {
        return new Type(name, description, timestamp, deletable);
    }
}
