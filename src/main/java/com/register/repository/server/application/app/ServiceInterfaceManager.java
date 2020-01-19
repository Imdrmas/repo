package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.OperationDto;
import com.register.repository.server.application.dto.ServiceInterfaceDto;
import org.springframework.stereotype.Service;

@Service
public interface ServiceInterfaceManager {

    ServiceInterfaceDto findServiceInterfaceById(Long idServiceInterface);

    ServiceInterfaceDto updateServiceInterface(ServiceInterfaceDto serviceInterfaceDto, Long idServiceInterface);

    void deleteServiceInterface(Long idServiceInterface);

    OperationDto createOperation(OperationDto operationDto, Long idServiceInterface);
}
