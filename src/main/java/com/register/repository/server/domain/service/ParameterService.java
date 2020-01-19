package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Parameter;

public interface ParameterService {

    Parameter updateParameter(Parameter parameterExist, Parameter newParameter);
}
