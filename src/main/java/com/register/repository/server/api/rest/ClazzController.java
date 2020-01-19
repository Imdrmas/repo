package com.register.repository.server.api.rest;

import com.register.repository.server.application.app.ClazzManager;
import com.register.repository.server.application.dto.ClazzDto;
import com.register.repository.server.application.dto.PropertyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClazzController extends RestBaseController {

    private final ClazzManager clazzManager;

    @Autowired
    public ClazzController(ClazzManager clazzManager) {
        this.clazzManager = clazzManager;
    }

    @PutMapping("/clazz/update/{idClazz}")
    ClazzDto updateClazz(@RequestBody ClazzDto clazzDto, @PathVariable("idClazz") Long idClazz) {
        return clazzManager.updateClazz(clazzDto, idClazz);
    }

    @GetMapping("/clazz/{idClazz}")
    ClazzDto findClazzById(@PathVariable("idClazz") Long idClazz) {
        return clazzManager.findClazzById(idClazz);
    }
    @GetMapping("/clazz/{idClazz}")
    void deleteClazz(@PathVariable("idClazz") Long idClazz) {
        clazzManager.deleteClazz(idClazz);
    }
    @PostMapping("/clazz/update/property/{idClazz}")
    PropertyDto createProperty(@RequestBody PropertyDto propertyDto, @PathVariable("idClazz") Long idClazz){
        return clazzManager.createProperty(propertyDto, idClazz);
    }
}
