package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.ParameterDto;
import com.register.repository.server.domain.OrikaBeanMapper;
import com.register.repository.server.domain.dao.ParameterDao;
import com.register.repository.server.domain.model.Parameter;
import com.register.repository.server.domain.service.ParameterDomainService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ParameterManagerImpl implements ParameterManager {

    private final ParameterDao parameterDao;

    private final OrikaBeanMapper orikaBeanMapper;

    private final ParameterDomainService parameterDomainService;

    public ParameterManagerImpl(ParameterDao parameterDao, OrikaBeanMapper orikaBeanMapper,
                                ParameterDomainService parameterDomainService) {
        this.parameterDao = parameterDao;
        this.orikaBeanMapper = orikaBeanMapper;
        this.parameterDomainService = parameterDomainService;
    }

    @Override
    public ParameterDto findParameterById(Long idParameter) {
        return orikaBeanMapper.convertDTO(parameterDao.findById(idParameter).orElse(null), ParameterDto.class);
    }

    @Override
    public ParameterDto updateParameter(ParameterDto parameterDto, Long idParameter) {
        return null;
    }

    @Override
    public void deleteParameter(Long idParameter) {
        Parameter parameter = parameterDao.findById(idParameter).orElse(null);
        parameterDomainService.deleteParameter(parameter);
    }
}
