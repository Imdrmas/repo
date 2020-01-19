package com.register.repository.server.api.rest;

import com.register.repository.server.application.app.ApplicationManager;
import com.register.repository.server.application.dto.ApplicationComponentDto;
import com.register.repository.server.application.dto.ApplicationDto;
import com.register.repository.server.application.dto.TypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicationController extends RestBaseController {

    private final ApplicationManager applicationManager;

    @Autowired
    public ApplicationController(ApplicationManager applicationManager) {
        this.applicationManager = applicationManager;
    }

    @PostMapping("/application/create")
    ApplicationDto createApplication(@RequestBody ApplicationDto applicationDto) {
        return applicationManager.createApplication(applicationDto);
    }

    @GetMapping("/application/allApplications")
    List<ApplicationDto> findAllApplications() {
        return applicationManager.findAllApplications();
    }

    @GetMapping("/application/{idApplication}")
    ApplicationDto findApplicationById(@PathVariable("idApplication") Long idApplication) {
        return applicationManager.findApplicationById(idApplication);
    }

    @DeleteMapping("/application/delete/{idApplication}")
    void deleteApplication(@PathVariable("idApplication") Long idApplication) {
        applicationManager.deleteApplication(idApplication);
    }

    @PostMapping("/application/create/type/{idApplication}")
    TypeDto createType(@RequestBody TypeDto typeDto, @PathVariable("idApplication") Long idApplication) {
        return applicationManager.createType(typeDto, idApplication);
    }
    @PostMapping("/application/create/component/{idApplication}")
    ApplicationComponentDto createApplicationComponent(@RequestBody ApplicationComponentDto applicationComponentDto,
                                             @PathVariable("idApplication") Long idApplication){
        return applicationManager.createApplicationComponent(applicationComponentDto, idApplication);
    }
    @PutMapping("/application/update/{idApplication}")
    ApplicationDto updateApplication(@RequestBody ApplicationDto applicationDto, @PathVariable("idApplication") Long idApplication) {
        return applicationManager.updateApplication(applicationDto, idApplication);
    }

}
