package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.PropertyDto;
import com.register.repository.server.domain.OrikaBeanMapper;
import com.register.repository.server.domain.dao.PropertyDao;
import com.register.repository.server.domain.model.Property;
import com.register.repository.server.domain.service.PropertyDomainService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PropertyManagerImpl implements PropertyManager {

    private final PropertyDao propertyDao;

    private final OrikaBeanMapper orikaBeanMapper;

    private final PropertyDomainService propertyDomainService;

    public PropertyManagerImpl(PropertyDao propertyDao, OrikaBeanMapper orikaBeanMapper,
                               PropertyDomainService propertyDomainService) {
        this.propertyDao = propertyDao;
        this.orikaBeanMapper = orikaBeanMapper;
        this.propertyDomainService = propertyDomainService;
    }

    @Override
    public PropertyDto findPropertyById(Long idProperty) {
        return orikaBeanMapper.convertDTO(propertyDao.findById(idProperty).orElse(null), PropertyDto.class);
    }

    @Override
    public PropertyDto updateProperty(PropertyDto propertyDto, Long idProperty) {
        return null;
    }

    @Override
    public void deleteProperty(Long idProperty) {
        Property property = propertyDao.findById(idProperty).orElse(null);
        propertyDomainService.deleteProperty(property);
    }
}
