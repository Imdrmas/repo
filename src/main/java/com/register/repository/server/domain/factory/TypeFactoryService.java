package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Type;

import java.util.Date;


public interface TypeFactoryService {

    Type create();

    Type create(String name, String description, Date timestamp, boolean deletable);
}
