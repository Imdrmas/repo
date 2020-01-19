package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.ParameterDto;
import org.springframework.stereotype.Service;

@Service
public interface ParameterManager {

    ParameterDto findParameterById(Long idParameter);

    ParameterDto updateParameter(ParameterDto parameterDto, Long idParameter);

    void deleteParameter(Long idParameter);
}
