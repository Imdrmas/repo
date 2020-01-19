package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Application;
import com.register.repository.server.domain.model.ApplicationComponent;
import com.register.repository.server.domain.model.Type;
import org.springframework.stereotype.Service;

@Service
public interface ApplicationDomainService {

    Application findApplicationById(Long idApplication);

    Application createApplication(Application application);

    Application updateApplication(Application applicationExist, Application newApplication);

    Type createType(Type type, Application application);

    ApplicationComponent createApplicationComponent(ApplicationComponent applicationComponent, Application application);


    void deleteApplication(Application application);
}
