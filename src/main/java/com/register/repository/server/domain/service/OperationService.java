package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Operation;
import com.register.repository.server.domain.model.Parameter;

public interface OperationService {

    Operation updateOperation(Operation operationExist, Operation newOperation);

    Parameter createParameter(Parameter parameter, Operation operation);
}
