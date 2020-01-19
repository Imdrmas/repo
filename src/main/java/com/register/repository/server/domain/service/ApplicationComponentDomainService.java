package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.ApplicationComponent;
import com.register.repository.server.domain.model.ServiceInterface;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface ApplicationComponentDomainService {

    ApplicationComponent updateApplicationComponent(ApplicationComponent newApplicationComponent,
                                                    ApplicationComponent applicationComponentExist);

    ServiceInterface createServiceInterfaceService(ServiceInterface serviceInterface,
                                                          ApplicationComponent applicationComponent);

      ApplicationComponent  findComponent(Long idComponent);

      void deleteComponent(ApplicationComponent applicationComponent);
}
