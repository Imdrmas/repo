package com.register.repository.server.api.rest;

import com.register.repository.server.application.app.ParameterManager;
import com.register.repository.server.application.dto.ParameterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParameterController extends RestBaseController {

    private final ParameterManager parameterManager;

    @Autowired
    public ParameterController(ParameterManager parameterManager) {
        this.parameterManager = parameterManager;
    }

    @GetMapping("/parameter/{idParameter}")
    ParameterDto findParameterById(@PathVariable("idParameter") Long idParameter){
        return parameterManager.findParameterById(idParameter);
    }

    @PutMapping("/parameter/update/{idParameter}")
    ParameterDto updateParameter(@RequestBody ParameterDto parameterDto, @PathVariable("idParameter") Long idParameter){
        return parameterManager.updateParameter(parameterDto, idParameter);
    }

    @DeleteMapping("/parameter/delete/{idParameter}")
    void deleteParameter(@PathVariable("idParameter") Long idParameter){
        parameterManager.deleteParameter(idParameter);
    }
}
