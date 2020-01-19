package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.ClazzDto;
import com.register.repository.server.application.dto.EnumerationDto;
import com.register.repository.server.application.dto.TypeDto;
import org.springframework.stereotype.Service;

@Service
public interface TypeManager {

    TypeDto findTypeById(Long idType);

    TypeDto updateType(TypeDto typeDto, Long idType);

    void deleteType(Long idType);

    ClazzDto createClazz(ClazzDto clazzDto, Long idType);

    EnumerationDto createEnumeration(EnumerationDto enumerationDto, Long idType);
}
