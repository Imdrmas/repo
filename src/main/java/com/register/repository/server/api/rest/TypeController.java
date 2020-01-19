package com.register.repository.server.api.rest;

import com.register.repository.server.application.app.TypeManager;
import com.register.repository.server.application.dto.ClazzDto;
import com.register.repository.server.application.dto.EnumerationDto;
import com.register.repository.server.application.dto.TypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TypeController extends RestBaseController {

    private final TypeManager typeManager;

    @Autowired
    public TypeController(TypeManager typeManager) {
        this.typeManager = typeManager;
    }

    @GetMapping("/type/{idType}")
    TypeDto findTypeById(@PathVariable("idType") Long idType) {
        return typeManager.findTypeById(idType);
    }

    @PutMapping("/type/update/{idType}")
    TypeDto updateType(@RequestBody TypeDto typeDto, @PathVariable("idType") Long idType) {
        return typeManager.updateType(typeDto, idType);
    }

    @DeleteMapping("/type/delete/{idType}")
    void deleteType(@PathVariable("idType") Long idType) {
        typeManager.deleteType(idType);
    }

    @PostMapping("/type/create/clazz/{idType}")
    ClazzDto createClazz(@RequestBody ClazzDto clazzDto, @PathVariable("idType") Long idType) {
        return typeManager.createClazz(clazzDto, idType);
    }

    @PostMapping("/type/create/enumeration/{idType}")
    EnumerationDto createEnumeration(@RequestBody EnumerationDto enumerationDto, @PathVariable("idType") Long idType) {
        return typeManager.createEnumeration(enumerationDto, idType);
    }
}
