package com.assessment.infnet.api.controllers;

import com.assessment.infnet.api.model.models.Keyboard;
import com.assessment.infnet.api.model.services.KeyboardService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product/keyboard")
public class KeyboardController {

    @Autowired
    private KeyboardService keyboardService;

    @ApiOperation(value = "Get all keyboards")
    @GetMapping(value = "/")
    public List<Keyboard> getAllKeyboards() {
        return keyboardService.getAll();
    }

    @ApiOperation(value = "Get a specific keyboard")
    @GetMapping(value = "/{id}")
    public Keyboard getKeyboard(@PathVariable Integer id) {
        return keyboardService.getById(id);
    }
}
