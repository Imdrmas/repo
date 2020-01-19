package com.register.repository.server.api.rest;

import com.register.repository.server.application.app.OperationManager;
import com.register.repository.server.application.dto.OperationDto;
import com.register.repository.server.application.dto.ParameterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OperationController extends RestBaseController {

    private final OperationManager operationManager;

    @Autowired
    public OperationController(OperationManager operationManager) {
        this.operationManager = operationManager;
    }

    @GetMapping("/operation/{idOperation}")
    OperationDto findOperationById(@PathVariable("idOperation") Long idOperation) {
     return operationManager.findOperationById(idOperation);
    }

    @PutMapping("/operation/update/{idOperation}")
    OperationDto updateOperation(@RequestBody OperationDto operationDto, @PathVariable("idOperation") Long idOperation){
        return operationManager.updateOperation(operationDto, idOperation);
    }

    @DeleteMapping("/operaion/delete/{idOperation}")
    void deleteOperation(@PathVariable("idOperation") Long idOperation) {
        operationManager.deleteOperation(idOperation);
    }

    @PostMapping("/operation/create/parameter/{idOperation}")
    ParameterDto createParameter(@RequestBody ParameterDto parameterDto, @PathVariable("idOperation") Long idOperation) {
        return operationManager.createParameter(parameterDto, idOperation);
    }
}
