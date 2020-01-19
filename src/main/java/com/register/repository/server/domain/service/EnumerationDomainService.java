package com.register.repository.server.domain.service;

import com.register.repository.server.domain.model.Enumeration;
import com.register.repository.server.domain.model.EnumerationLiteral;
import org.springframework.stereotype.Service;

@Service
public interface EnumerationDomainService {

    Enumeration updateEnumeration(Enumeration enumerationExist, Enumeration newEnumeration);

    EnumerationLiteral createEnumerationLiteral(EnumerationLiteral enumerationLiteral, Enumeration enumeration);

    void deleteEnumeration(Enumeration enumeration);
}
