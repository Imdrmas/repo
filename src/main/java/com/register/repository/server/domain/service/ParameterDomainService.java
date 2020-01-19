package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Parameter;

public interface ParameterDomainService {

    Parameter updateParameter(Parameter parameterExist, Parameter newParameter);

    void deleteParameter(Parameter parameter);
}
