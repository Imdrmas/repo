package com.register.repository.server.api.rest;

import com.register.repository.server.application.app.EnumerationManager;
import com.register.repository.server.application.dto.EnumerationDto;
import com.register.repository.server.application.dto.EnumerationLiteralDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EnumerationController extends RestBaseController {

    private final EnumerationManager enumerationManager;

    @Autowired
    public EnumerationController(EnumerationManager enumerationManager) {
        this.enumerationManager = enumerationManager;
    }

    @GetMapping("/enumeration/{idEnumeration}")
    EnumerationDto findEnumerationById(@PathVariable("idEnumeration") Long idEnumeration){
        return enumerationManager.findEnumerationById(idEnumeration);
    }

    @PutMapping("/enumeration/update/{idEnumeration}")
    EnumerationDto updateEnumeration(@RequestBody EnumerationDto enumerationDto,
                                     @PathVariable("idEnumeration") Long idEnumeration){
        return enumerationManager.updateEnumeration(enumerationDto, idEnumeration);
    }

    @DeleteMapping("/enumeration/{idEnumeration}")
    void deleteEnumeration(@PathVariable("idEnumeration") Long idEnumeration){
        enumerationManager.deleteEnumeration(idEnumeration);
    }

    @PostMapping("/enumeration/create/enumerationLiteral/{idEnumeration}")
    EnumerationLiteralDto createEnumerationLiteral(EnumerationLiteralDto enumerationLiteralDto, Long idEnumeration){
        return enumerationManager.createEnumerationLiteral(enumerationLiteralDto, idEnumeration);
    }
}
