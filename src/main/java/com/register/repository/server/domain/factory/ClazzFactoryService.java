package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Clazz;

import java.util.Date;

public interface ClazzFactoryService {

    Clazz create();

    Clazz create(String name, String description);
}
