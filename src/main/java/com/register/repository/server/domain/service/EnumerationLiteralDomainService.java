package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.EnumerationLiteral;
import org.springframework.stereotype.Service;

@Service
public interface EnumerationLiteralDomainService {

    EnumerationLiteral updateEnumerationLiteral(EnumerationLiteral enumerationLiteralExist,
                                                EnumerationLiteral NewEnumerationLiteral);

    void deleteEnumerationLiteral(EnumerationLiteral enumerationLiteral);
}
