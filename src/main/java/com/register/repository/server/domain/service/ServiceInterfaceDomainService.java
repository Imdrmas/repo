package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Operation;
import com.register.repository.server.domain.model.ServiceInterface;
import org.springframework.stereotype.Service;

@Service
public interface ServiceInterfaceDomainService {

    ServiceInterface updateServiceInterface(ServiceInterface serviceInterfaceExist, ServiceInterface newServiceInterface);

    Operation createOperation(Operation operation, ServiceInterface serviceInterface);

    void deleteServiceInterface(ServiceInterface serviceInterface);
}
