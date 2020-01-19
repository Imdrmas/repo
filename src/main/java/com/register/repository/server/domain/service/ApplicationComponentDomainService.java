package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.ApplicationComponent;
import com.register.repository.server.domain.model.ServiceInterface;

public interface ApplicationComponentDomainService {

    ApplicationComponent updateApplicationComponent(ApplicationComponent newApplicationComponent,
                                                    ApplicationComponent applicationComponentExist);

    ServiceInterface createServiceInterfaceService(ServiceInterface serviceInterface,
                                                          ApplicationComponent applicationComponent);

      ApplicationComponent  findComponent(Long idComponent);

      void deleteComponent(ApplicationComponent applicationComponent);
}
