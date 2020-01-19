package com.register.repository.server.domain.factory;

import com.register.repository.server.domain.model.Parameter;

import java.util.Date;

public interface ParameterFactoryService {

    Parameter create();

    Parameter create(String name, String description, Date timestamp);
}
