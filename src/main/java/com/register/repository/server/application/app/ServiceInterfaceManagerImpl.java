package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.OperationDto;
import com.register.repository.server.application.dto.ServiceInterfaceDto;
import com.register.repository.server.domain.OrikaBeanMapper;
import com.register.repository.server.domain.dao.ServiceInterfaceDao;
import com.register.repository.server.domain.model.ServiceInterface;
import com.register.repository.server.domain.service.ServiceInterfaceDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServiceInterfaceManagerImpl implements ServiceInterfaceManager {

    private final ServiceInterfaceDao serviceInterfaceDao;

    private final OrikaBeanMapper orikaBeanMapper;

    private final ServiceInterfaceDomainService serviceInterfaceDomainService;

    @Autowired
    public ServiceInterfaceManagerImpl(ServiceInterfaceDao serviceInterfaceDao, OrikaBeanMapper orikaBeanMapper,
                                       ServiceInterfaceDomainService serviceInterfaceDomainService) {
        this.serviceInterfaceDao = serviceInterfaceDao;
        this.orikaBeanMapper = orikaBeanMapper;
        this.serviceInterfaceDomainService = serviceInterfaceDomainService;
    }

    @Override
    public ServiceInterfaceDto findServiceInterfaceById(Long idServiceInterface) {
        return orikaBeanMapper.convertDTO(serviceInterfaceDao.findById(idServiceInterface).orElse(null), ServiceInterfaceDto.class);
    }

    @Override
    public ServiceInterfaceDto updateServiceInterface(ServiceInterfaceDto serviceInterfaceDto, Long idServiceInterface) {
        return null;
    }

    @Override
    public void deleteServiceInterface(Long idServiceInterface) {
        ServiceInterface serviceInterface = serviceInterfaceDao.findById(idServiceInterface).orElse(null);
        serviceInterfaceDomainService.deleteServiceInterface(serviceInterface);
    }

    @Override
    public OperationDto createOperation(OperationDto operationDto, Long idServiceInterface) {
        return null;
    }
}
