package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.ApplicationComponentDto;
import com.register.repository.server.application.dto.ServiceInterfaceDto;
import org.springframework.stereotype.Service;

@Service
public interface ApplicationComponentManager {

    ApplicationComponentDto findComponentById(Long idComponent);

    ApplicationComponentDto updateComponent(ApplicationComponentDto componentDto, Long idComponent);

    void deleteComponent(Long idComponent);

    ServiceInterfaceDto createServiceInterfaceService(ServiceInterfaceDto serviceInterfaceDto, Long idComponent);


}
