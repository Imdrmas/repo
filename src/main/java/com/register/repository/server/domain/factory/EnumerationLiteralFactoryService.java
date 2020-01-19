package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.EnumerationLiteral;

import java.util.Date;

public interface EnumerationLiteralFactoryService {

    EnumerationLiteral create();

    EnumerationLiteral create(String name, String description, Date timestamp, int multiple);
}
