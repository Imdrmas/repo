package com.register.repository.server.application.app;


import com.register.repository.server.application.dto.EnumerationLiteralDto;
import org.springframework.stereotype.Service;

@Service
public interface EnumerationLiteralManager {

    EnumerationLiteralDto findEnumerationLiteralById(Long idEnumerationLiteral);

    EnumerationLiteralDto updateEnumerationLiteral(EnumerationLiteralDto enumerationLiteralDto,
                                                   Long idEnumerationLiteral);

    void deleteEnumerationLiteral(Long idEnumerationLiteral);
}
