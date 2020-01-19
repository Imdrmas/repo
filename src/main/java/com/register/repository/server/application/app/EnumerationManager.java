package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.EnumerationDto;
import com.register.repository.server.application.dto.EnumerationLiteralDto;
import org.springframework.stereotype.Service;

@Service
public interface EnumerationManager {

    EnumerationDto findEnumerationById(Long idEnumeration);

    EnumerationDto updateEnumeration(EnumerationDto enumerationDto, Long idEnumeration);

    void deleteEnumeration(Long idEnumeration);

    EnumerationLiteralDto createEnumerationLiteral(EnumerationLiteralDto enumerationLiteralDto, Long idEnumeration);
}
