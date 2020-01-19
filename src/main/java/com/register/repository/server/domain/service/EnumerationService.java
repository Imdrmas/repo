package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Enumeration;
import com.register.repository.server.domain.model.EnumerationLiteral;

public interface EnumerationService {

    Enumeration updateEnumeration(Enumeration enumerationExist, Enumeration newEnumeration);

    EnumerationLiteral createEnumerationLiteral(EnumerationLiteral enumerationLiteral, Enumeration enumeration);
}
