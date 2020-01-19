package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.ClazzDto;
import com.register.repository.server.application.dto.PropertyDto;
import org.springframework.stereotype.Service;

@Service
public interface ClazzManager {

    ClazzDto updateClazz(ClazzDto clazzDto, Long idClazz);

    ClazzDto findClazzById(Long idClazz);

    void deleteClazz(Long idClazz);

    PropertyDto createProperty(PropertyDto propertyDto, Long idClazz);
}
