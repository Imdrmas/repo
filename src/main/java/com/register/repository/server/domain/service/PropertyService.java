package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Property;

public interface PropertyService {

    Property updateProperty(Property propertyExist, Property newProperty);
}
