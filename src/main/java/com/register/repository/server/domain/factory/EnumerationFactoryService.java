package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Enumeration;

import java.util.Date;

public interface EnumerationFactoryService {

    Enumeration create();

    Enumeration create(String name, String description);
}
