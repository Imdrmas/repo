package com.register.repository.server.api.rest;

import com.register.repository.server.application.app.PropertyManager;
import com.register.repository.server.application.dto.PropertyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PropertyController extends RestBaseController {

    private final PropertyManager propertyManager;

    @Autowired
    public PropertyController(PropertyManager propertyManager) {
        this.propertyManager = propertyManager;
    }

    @GetMapping("/property/{idProperty}")
    PropertyDto findPropertyById(@PathVariable("idProperty") Long idProperty) {
        return propertyManager.findPropertyById(idProperty);
    }

    @PutMapping("/property/update/{idProperty}")
    PropertyDto updateProperty(@RequestBody PropertyDto propertyDto, @PathVariable("idProperty") Long idProperty) {
        return propertyManager.updateProperty(propertyDto, idProperty);
    }

    @DeleteMapping("/property/delete/{idProperty}")
    void deleteProperty(@PathVariable("idProperty") Long idProperty) {
        propertyManager.deleteProperty(idProperty);
    }
}
