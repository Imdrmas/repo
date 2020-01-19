package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.EnumerationDto;
import com.register.repository.server.application.dto.EnumerationLiteralDto;
import com.register.repository.server.domain.OrikaBeanMapper;
import com.register.repository.server.domain.dao.EnumerationDao;
import com.register.repository.server.domain.model.Enumeration;
import com.register.repository.server.domain.service.EnumerationDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EnumerationManagerImpl implements EnumerationManager {

    private final EnumerationDao enumerationDao;

    private final OrikaBeanMapper orikaBeanMapper;

    private final EnumerationDomainService enumerationDomainService;

    @Autowired
    public EnumerationManagerImpl(EnumerationDao enumerationDao, OrikaBeanMapper orikaBeanMapper,
                                  EnumerationDomainService enumerationDomainService) {
        this.enumerationDao = enumerationDao;
        this.orikaBeanMapper = orikaBeanMapper;
        this.enumerationDomainService = enumerationDomainService;
    }


    @Override
    public EnumerationDto findEnumerationById(Long idEnumeration) {
        return orikaBeanMapper.convertDTO(enumerationDao.findById(idEnumeration).orElse(null), EnumerationDto.class);
    }

    @Override
    public EnumerationDto updateEnumeration(EnumerationDto enumerationDto, Long idEnumeration) {
        return null;
    }

    @Override
    public void deleteEnumeration(Long idEnumeration) {
        Enumeration enumeration = enumerationDao.findById(idEnumeration).orElse(null);
        enumerationDomainService.deleteEnumeration(enumeration);
    }

    @Override
    public EnumerationLiteralDto createEnumerationLiteral(EnumerationLiteralDto enumerationLiteralDto, Long idEnumeration) {
        return null;
    }
}
