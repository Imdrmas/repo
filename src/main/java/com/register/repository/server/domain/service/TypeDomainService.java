package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Clazz;
import com.register.repository.server.domain.model.Enumeration;
import com.register.repository.server.domain.model.Type;

public interface TypeDomainService {

    Type updateType(Type typeExist, Type newType);

    Clazz createClazz(Clazz clazz, Type type);

    Enumeration createEnumeration(Enumeration enumeration, Type type);

    void deleteType(Type type);
}
