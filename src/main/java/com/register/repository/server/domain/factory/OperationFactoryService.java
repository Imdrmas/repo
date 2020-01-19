package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Operation;

import java.util.Date;

public interface OperationFactoryService {

    Operation create();

    Operation create(String name, String description, Date timestamp);
}
