package com.assessment.infnet.api.controllers;

import com.assessment.infnet.api.model.models.CoffeeMachine;
import com.assessment.infnet.api.model.services.CoffeeMachineService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product/coffee-machine")
public class CoffeeMachineController {

    @Autowired
    private CoffeeMachineService coffeeMachineService;

    @ApiOperation(value = "Get all coffee machines")
    @GetMapping(value = "/")
    public List<CoffeeMachine> getAllCoffeeMachines() {
        return coffeeMachineService.getAll();
    }

    @ApiOperation(value = "Get a specific coffee machine")
    @GetMapping(value = "/{id}")
    public CoffeeMachine getCoffeeMachine(@PathVariable Integer id) {
        return coffeeMachineService.getById(id);
    }
}
