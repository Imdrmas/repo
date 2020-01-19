package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.OperationDto;
import com.register.repository.server.application.dto.ParameterDto;
import com.register.repository.server.domain.OrikaBeanMapper;
import com.register.repository.server.domain.dao.OperationDao;
import com.register.repository.server.domain.model.Operation;
import com.register.repository.server.domain.service.OperationDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OperationManagerImpl implements OperationManager {

    private final OperationDao operationDao;

    private final OrikaBeanMapper orikaBeanMapper;

    private final OperationDomainService operationDomainService;

    @Autowired
    public OperationManagerImpl(OperationDao operationDao, OrikaBeanMapper orikaBeanMapper,
                                OperationDomainService operationDomainService) {
        this.operationDao = operationDao;
        this.orikaBeanMapper = orikaBeanMapper;
        this.operationDomainService = operationDomainService;
    }

    @Override
    public OperationDto findOperationById(Long idOperation) {
        return orikaBeanMapper.convertDTO(operationDao.findById(idOperation).orElse(null), OperationDto.class);
    }

    @Override
    public OperationDto updateOperation(OperationDto operationDto, Long idOperation) {
        return null;
    }

    @Override
    public void deleteOperation(Long idOperation) {
        Operation operation = operationDao.findById(idOperation).orElse(null);
        operationDomainService.deleteOperation(operation);
    }

    @Override
    public ParameterDto createParameter(ParameterDto parameterDto, Long idOperation) {
        return null;
    }
}
