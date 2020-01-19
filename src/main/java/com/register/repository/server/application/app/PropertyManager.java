package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.PropertyDto;
import org.springframework.stereotype.Service;

@Service
public interface PropertyManager {

    PropertyDto findPropertyById(Long idProperty);

    PropertyDto updateProperty(PropertyDto propertyDto, Long idProperty);

    void deleteProperty(Long idProperty);
}
