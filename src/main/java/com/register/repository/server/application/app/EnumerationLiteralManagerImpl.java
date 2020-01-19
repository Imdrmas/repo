package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.EnumerationLiteralDto;
import com.register.repository.server.domain.OrikaBeanMapper;
import com.register.repository.server.domain.dao.EnumerationLiteralDao;
import com.register.repository.server.domain.model.EnumerationLiteral;
import com.register.repository.server.domain.service.EnumerationDomainService;
import com.register.repository.server.domain.service.EnumerationLiteralDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EnumerationLiteralManagerImpl implements EnumerationLiteralManager {

    private final EnumerationLiteralDao enumerationLiteralDao;

    private final OrikaBeanMapper orikaBeanMapper;

    private final EnumerationLiteralDomainService enumerationLiteralDomainService;

    @Autowired
    public EnumerationLiteralManagerImpl(EnumerationLiteralDao enumerationLiteralDao, OrikaBeanMapper orikaBeanMapper,
                                         EnumerationLiteralDomainService enumerationLiteralDomainService) {
        this.enumerationLiteralDao = enumerationLiteralDao;
        this.orikaBeanMapper = orikaBeanMapper;
        this.enumerationLiteralDomainService = enumerationLiteralDomainService;
    }


    @Override
    public EnumerationLiteralDto findEnumerationLiteralById(Long idEnumerationLiteral) {
        return null;
    }

    @Override
    public EnumerationLiteralDto updateEnumerationLiteral(EnumerationLiteralDto enumerationLiteralDto,
                                                          Long idEnumerationLiteral) {
        return null;
    }

    @Override
    public void deleteEnumerationLiteral(Long idEnumerationLiteral) {
        EnumerationLiteral enumerationLiteral = enumerationLiteralDao.findById(idEnumerationLiteral).orElse(null);
        enumerationLiteralDomainService.deleteEnumerationLiteral(enumerationLiteral);
    }
}
