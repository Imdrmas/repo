package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.OperationDto;
import com.register.repository.server.application.dto.ParameterDto;
import org.springframework.stereotype.Service;

@Service
public interface OperationManager {

    OperationDto findOperationById(Long idOperation);

    OperationDto updateOperation(OperationDto operationDto, Long idOperation);

    void deleteOperation(Long idOperation);

    ParameterDto createParameter(ParameterDto parameterDto, Long idOperation);
}
