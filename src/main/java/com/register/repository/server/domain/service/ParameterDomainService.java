package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Parameter;
import org.springframework.stereotype.Service;

@Service
public interface ParameterDomainService {

    Parameter updateParameter(Parameter parameterExist, Parameter newParameter);

    void deleteParameter(Parameter parameter);
}
