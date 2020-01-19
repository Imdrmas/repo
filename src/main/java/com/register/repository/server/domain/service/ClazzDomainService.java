package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Clazz;
import com.register.repository.server.domain.model.Property;

public interface ClazzDomainService {

    Clazz updateClazz(Clazz newClazz, Clazz clazzExist);

    Property createProperty(Property property, Clazz clazz);

    void deleteClazz(Clazz clazz);
}
