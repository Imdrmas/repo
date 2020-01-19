package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.ApplicationComponent;
import com.register.repository.server.domain.model.ServiceInterface;

public interface ApplicationComponentService {

    ApplicationComponent updateApplicationComponent(ApplicationComponent newApplicationComponent,
                                                    ApplicationComponent applicationComponentExist);

    ServiceInterfaceService createServiceInterfaceService(ServiceInterface serviceInterface,
                                                          ApplicationComponent applicationComponent);
}
