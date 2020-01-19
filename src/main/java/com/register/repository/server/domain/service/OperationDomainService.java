package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Operation;
import com.register.repository.server.domain.model.Parameter;
import org.springframework.stereotype.Service;

@Service
public interface OperationDomainService {

    Operation updateOperation(Operation operationExist, Operation newOperation);

    Parameter createParameter(Parameter parameter, Operation operation);

    void deleteOperation(Operation operation);
}
