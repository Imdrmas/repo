package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.ApplicationComponentDto;
import com.register.repository.server.application.dto.ServiceInterfaceDto;
import com.register.repository.server.domain.OrikaBeanMapper;
import com.register.repository.server.domain.dao.ApplicationComponentDao;
import com.register.repository.server.domain.dao.ApplicationDao;
import com.register.repository.server.domain.model.Application;
import com.register.repository.server.domain.model.ApplicationComponent;
import com.register.repository.server.domain.service.ApplicationComponentDomainService;
import com.register.repository.server.domain.service.ApplicationDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Component
public class ApplicationComponentManagerImpl implements ApplicationComponentManager {

    private final ApplicationComponentDomainService applicationComponentDomainService;

    private final OrikaBeanMapper orikaBeanMapper;

    private final ApplicationComponentDao applicationComponentDao;

    @Autowired
    public ApplicationComponentManagerImpl(ApplicationComponentDomainService applicationComponentDomainService,
                                           OrikaBeanMapper orikaBeanMapper,
                                           ApplicationComponentDao applicationComponentDao) {
        this.applicationComponentDomainService = applicationComponentDomainService;
        this.orikaBeanMapper = orikaBeanMapper;
        this.applicationComponentDao = applicationComponentDao;
    }

    @Override
    public ApplicationComponentDto findComponentById(Long idComponent) {
        return orikaBeanMapper.convertDTO(applicationComponentDao.findById(idComponent).orElse(null),
                ApplicationComponentDto.class);
    }

    @Override
    public ApplicationComponentDto updateComponent(ApplicationComponentDto componentDto, Long idComponent) {
        return null;
    }

    @Override
    public void deleteComponent(Long idComponent) {
        ApplicationComponent applicationComponent = applicationComponentDao.findById(idComponent).orElse(null);
        applicationComponentDomainService.deleteComponent(applicationComponent);
    }

    @Override
    public ServiceInterfaceDto createServiceInterfaceService(ServiceInterfaceDto serviceInterfaceDto, Long idComponent) {
        return null;
    }
}
