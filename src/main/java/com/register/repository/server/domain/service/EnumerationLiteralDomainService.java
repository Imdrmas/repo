package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.EnumerationLiteral;

public interface EnumerationLiteralDomainService {

    EnumerationLiteral updateEnumerationLiteral(EnumerationLiteral enumerationLiteralExist,
                                                EnumerationLiteral NewEnumerationLiteral);

    void deleteEnumerationLiteral(EnumerationLiteral enumerationLiteral);
}
