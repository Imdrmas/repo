package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Operation;
import com.register.repository.server.domain.model.ServiceInterface;

public interface ServiceInterfaceService {

    ServiceInterface updateServiceInterface(ServiceInterface serviceInterfaceExist, ServiceInterface newServiceInterface);

    Operation createOperation(Operation operation, ServiceInterface serviceInterface);
}
