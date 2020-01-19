package com.register.repository.server.application.app;

import com.register.repository.server.application.dto.ApplicationComponentDto;
import com.register.repository.server.application.dto.ApplicationDto;
import com.register.repository.server.application.dto.TypeDto;
import com.register.repository.server.domain.model.Application;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface ApplicationManager {

    List<ApplicationDto> findAllApplications();

    ApplicationDto findApplicationById(Long idApplication);

    void deleteApplication(Long idApplication);

    ApplicationDto createApplication(ApplicationDto applicationDto);

    TypeDto createType(TypeDto typeDto, Long idApplication);

    ApplicationComponentDto createApplicationComponent(ApplicationComponentDto componentDto, Long idApplication);

    ApplicationDto updateApplication(ApplicationDto applicationDto, Long idApplication);
}
