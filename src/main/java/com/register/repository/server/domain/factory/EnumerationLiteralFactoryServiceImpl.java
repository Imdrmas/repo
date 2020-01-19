package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.EnumerationLiteral;

import java.util.Date;

public class EnumerationLiteralFactoryServiceImpl implements EnumerationLiteralFactoryService {
    @Override
    public EnumerationLiteral create() {
        return new EnumerationLiteral();
    }

    @Override
    public EnumerationLiteral create(String name, String description, Date timestamp, int multiple) {
        return new EnumerationLiteral(name, description, timestamp, multiple);
    }
}
