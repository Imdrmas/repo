package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Application;

import java.util.Date;

public interface ApplicationFactoryService {

    Application create();

    Application create(String name, String description, Date timestamp);
}
