package com.register.repository.server.api.rest;

import com.register.repository.server.application.app.ApplicationComponentManager;
import com.register.repository.server.application.dto.ApplicationComponentDto;
import com.register.repository.server.application.dto.ServiceInterfaceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApplicationComponentController extends RestBaseController {

    @Autowired
    private final ApplicationComponentManager applicationComponentManager;

    public ApplicationComponentController(ApplicationComponentManager applicationComponentManager) {
        this.applicationComponentManager = applicationComponentManager;
    }

    @GetMapping("/component/{idComponent}")
    ApplicationComponentDto findComponentById(@PathVariable("idComponent") Long idComponent) {
        return applicationComponentManager.findComponentById(idComponent);
    }

    @PutMapping("/component/update/{idComponent")
    ApplicationComponentDto updateComponent(@RequestBody ApplicationComponentDto applicationComponentDto,
                                            @PathVariable("idComponent") Long idComponent) {
        return applicationComponentManager.updateComponent(applicationComponentDto, idComponent);
    }
    @DeleteMapping("/component/delete/{idComponent}")
    void deleteComponent( @PathVariable("idComponent") Long idComponen) {
         applicationComponentManager.deleteComponent(idComponen);
    }

    @PostMapping("/component/create/{idComponent}")
    ServiceInterfaceDto createServiceInterfaceService(@RequestBody ServiceInterfaceDto serviceInterfaceDto,
                                                      @PathVariable("idComponent") Long idComponent) {
        return applicationComponentManager.createServiceInterfaceService(serviceInterfaceDto, idComponent);
    }
}
