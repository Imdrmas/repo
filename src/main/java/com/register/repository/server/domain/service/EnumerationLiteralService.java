package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.EnumerationLiteral;

public interface EnumerationLiteralService {

    EnumerationLiteral updateEnumerationLiteral(EnumerationLiteral enumerationLiteralExist,
                                                EnumerationLiteral NewEnumerationLiteral);
}
