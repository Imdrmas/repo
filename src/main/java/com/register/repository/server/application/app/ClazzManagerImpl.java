package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.ClazzDto;
import com.register.repository.server.application.dto.PropertyDto;
import com.register.repository.server.domain.OrikaBeanMapper;
import com.register.repository.server.domain.dao.ClazzDao;
import com.register.repository.server.domain.model.Clazz;
import com.register.repository.server.domain.service.ClazzDomainService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClazzManagerImpl implements ClazzManager {

    private final ClazzDao clazzDao;

    private final OrikaBeanMapper orikaBeanMapper;

    private final ClazzDomainService clazzDomainService;

    public ClazzManagerImpl(ClazzDao clazzDao, OrikaBeanMapper orikaBeanMapper, ClazzDomainService clazzDomainService) {
        this.clazzDao = clazzDao;
        this.orikaBeanMapper = orikaBeanMapper;
        this.clazzDomainService = clazzDomainService;
    }

    @Override
    public ClazzDto updateClazz(ClazzDto clazzDto, Long idClazz) {
        return null;
    }

    @Override
    public ClazzDto findClazzById(Long idClazz) {
        return orikaBeanMapper.convertDTO(clazzDao.findById(idClazz).orElse(null), ClazzDto.class);
    }

    @Override
    public void deleteClazz(Long idClazz) {
        Clazz clazz = clazzDao.findById(idClazz).orElse(null);
        clazzDomainService.deleteClazz(clazz);
    }

    @Override
    public PropertyDto createProperty(PropertyDto propertyDto, Long idClazz) {
        return null;
    }
}
