package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Application;
import com.register.repository.server.domain.model.ApplicationComponent;
import com.register.repository.server.domain.model.Type;

public interface ApplicationService {

    Application createApplication(Application application);

    Application updateApplication(Application applicationExist, Application newApplication);

    Type createType(Type type, Application application);

    ApplicationComponent createApplicationComponent(ApplicationComponent applicationComponent, Application application);


}
