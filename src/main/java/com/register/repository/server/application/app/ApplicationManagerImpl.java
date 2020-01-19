package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.ApplicationComponentDto;
import com.register.repository.server.application.dto.ApplicationDto;
import com.register.repository.server.application.dto.TypeDto;
import com.register.repository.server.domain.OrikaBeanMapper;
import com.register.repository.server.domain.dao.ApplicationDao;
import com.register.repository.server.domain.model.Application;
import com.register.repository.server.domain.service.ApplicationDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ApplicationManagerImpl implements ApplicationManager {

    private final ApplicationDao applicationDao;

    private final OrikaBeanMapper orikaBeanMapper;

    private final ApplicationDomainService applicationDomainService;

    @Autowired
    public ApplicationManagerImpl(ApplicationDao applicationDao, OrikaBeanMapper orikaBeanMapper,
                                  ApplicationDomainService applicationDomainService) {
        this.applicationDao = applicationDao;
        this.orikaBeanMapper = orikaBeanMapper;
        this.applicationDomainService = applicationDomainService;
    }

    @Override
    public List<ApplicationDto> findAllApplications() {
        return orikaBeanMapper.convertListDTO(applicationDao.findAll(), ApplicationDto.class);
    }

    @Override
    public ApplicationDto findApplicationById(Long idApplication) {
        return orikaBeanMapper.convertDTO(applicationDao.findById(idApplication).orElse(null), ApplicationDto.class);
    }

    @Override
    public void deleteApplication(Long idApplication) {
        Application application = applicationDao.findById(idApplication).orElse(null);
        applicationDomainService.deleteApplication(application);
    }

    @Override
    public ApplicationDto createApplication(ApplicationDto applicationDto) {
        return null;
    }

    @Override
    public TypeDto createType(TypeDto typeDto, Long idApplication) {
        return null;
    }

    @Override
    public ApplicationComponentDto createApplicationComponent(ApplicationComponentDto componentDto, Long idApplication) {
        return null;
    }

    @Override
    public ApplicationDto updateApplication(ApplicationDto applicationDto, Long idApplication) {
        return null;
    }
}
