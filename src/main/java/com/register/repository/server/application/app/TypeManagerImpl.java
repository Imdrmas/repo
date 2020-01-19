package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.ClazzDto;
import com.register.repository.server.application.dto.EnumerationDto;
import com.register.repository.server.application.dto.TypeDto;
import com.register.repository.server.domain.OrikaBeanMapper;
import com.register.repository.server.domain.dao.TypeDao;
import com.register.repository.server.domain.model.Type;
import com.register.repository.server.domain.service.TypeDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TypeManagerImpl implements TypeManager {

    private final TypeDao typeDao;

    private final OrikaBeanMapper orikaBeanMapper;

    private final TypeDomainService typeDomainService;

    @Autowired
    public TypeManagerImpl(TypeDao typeDao, OrikaBeanMapper orikaBeanMapper, TypeDomainService typeDomainService) {
        this.typeDao = typeDao;
        this.orikaBeanMapper = orikaBeanMapper;
        this.typeDomainService = typeDomainService;
    }

    @Override
    public TypeDto findTypeById(Long idType) {
        return orikaBeanMapper.convertDTO(typeDao.findById(idType).orElse(null), TypeDto.class);
    }

    @Override
    public TypeDto updateType(TypeDto typeDto, Long idType) {
        return null;
    }

    @Override
    public void deleteType(Long idType) {
        Type type = typeDao.findById(idType).orElse(null);
        typeDomainService.deleteType(type);
    }

    @Override
    public ClazzDto createClazz(ClazzDto clazzDto, Long idType) {
        return null;
    }

    @Override
    public EnumerationDto createEnumeration(EnumerationDto enumerationDto, Long idType) {
        return null;
    }
}
