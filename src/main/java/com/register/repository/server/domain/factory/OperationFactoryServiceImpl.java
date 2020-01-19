package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Operation;

import java.util.Date;

public class OperationFactoryServiceImpl implements OperationFactoryService {
    @Override
    public Operation create() {
        return new Operation();
    }

    @Override
    public Operation create(String name, String description, Date timestamp) {
        return new Operation(name, description, timestamp);
    }
}
