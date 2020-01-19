package com.register.repository.server.api.rest;

import com.register.repository.server.application.app.EnumerationLiteralManager;
import com.register.repository.server.application.dto.EnumerationLiteralDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class EnumerationLiteralController extends RestBaseController {

    private final EnumerationLiteralManager enumerationLiteralManager;

    public EnumerationLiteralController(EnumerationLiteralManager enumerationLiteralManager) {
        this.enumerationLiteralManager = enumerationLiteralManager;
    }

    @GetMapping("/enumerationLiteral/{idEnumerationLiteral}")
    EnumerationLiteralDto findEnumerationLiteralById(@PathVariable("idEnumerationLiteral") Long idEnumerationLiteral){
        return enumerationLiteralManager.findEnumerationLiteralById(idEnumerationLiteral);
    }

    @PutMapping("/enumerationLiteral/update/{idEnumerationLiteral}")
    EnumerationLiteralDto updateEnumerationLiteral(@RequestBody EnumerationLiteralDto enumerationLiteralDto,
                                                   @PathVariable("idEnumerationLiteral") Long idEnumerationLiteral){
        return enumerationLiteralManager.updateEnumerationLiteral(enumerationLiteralDto, idEnumerationLiteral);
    }

    @DeleteMapping("/enumerationLiteral/delete/{idEnumerationLiteral}")
    void deleteEnumerationLiteral(@PathVariable("idEnumerationLiteral") Long idEnumerationLiteral){
        enumerationLiteralManager.deleteEnumerationLiteral(idEnumerationLiteral);
    }
}


