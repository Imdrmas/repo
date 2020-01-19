package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.ApplicationComponent;

import java.util.Date;

public interface ApplicationComponentFactoryService {

    ApplicationComponent create();

    ApplicationComponent create(String name, String description, Date timestamp);
}
