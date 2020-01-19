package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Property;
import org.springframework.stereotype.Service;

@Service
public interface PropertyDomainService {

    Property updateProperty(Property propertyExist, Property newProperty);

    void deleteProperty(Property property);
}
