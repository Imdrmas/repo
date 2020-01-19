package com.register.repository.server.api.rest;

import com.register.repository.server.application.app.ServiceInterfaceManager;
import com.register.repository.server.application.dto.OperationDto;
import com.register.repository.server.application.dto.ServiceInterfaceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServiceInterfaceController extends RestBaseController {

    private final ServiceInterfaceManager serviceInterfaceManager;

    @Autowired
    public ServiceInterfaceController(ServiceInterfaceManager serviceInterfaceManager) {
        this.serviceInterfaceManager = serviceInterfaceManager;
    }

    @GetMapping("/service/interface/{idServiceInterface}")
    ServiceInterfaceDto findServiceInterfaceById(@PathVariable("idServiceInterface") Long idServiceInterface) {
        return serviceInterfaceManager.findServiceInterfaceById(idServiceInterface);
    }

    @PutMapping("/service/interface/update/{idServiceInterface}")
    ServiceInterfaceDto updateServiceInterface(@RequestBody ServiceInterfaceDto serviceInterfaceDto,
                                               @PathVariable("idServiceInterface") Long idServiceInterface) {
        return serviceInterfaceManager.updateServiceInterface(serviceInterfaceDto, idServiceInterface);
    }

    @DeleteMapping("/service/interface/delete/{idServiceInterface}")
    void deleteServiceInterface(@PathVariable("idServiceInterface") Long idServiceInterface) {
        serviceInterfaceManager.deleteServiceInterface(idServiceInterface);
    }

    @PostMapping("/service/interface/create/operation/{idServiceInterface}")
    OperationDto createOperation(@RequestBody OperationDto operationDto,
                                 @PathVariable("idServiceInterface") Long idServiceInterface) {
        return serviceInterfaceManager.createOperation(operationDto, idServiceInterface);
    }
}
