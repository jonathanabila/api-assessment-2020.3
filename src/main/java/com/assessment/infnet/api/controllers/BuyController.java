package com.assessment.infnet.api.controllers;

import com.assessment.infnet.api.model.models.Buy;
import com.assessment.infnet.api.model.services.BuyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buy")
public class BuyController {

    @Autowired
    private BuyService buyService;

    @ApiOperation(value = "Add a new buy")
    @PostMapping(value = "/add")
    public void addBuy(@RequestBody Buy buy) {
        buyService.addBuy(buy);
    }

    @ApiOperation(value = "Get all buys")
    @GetMapping(value = "/")
    public List<Buy> getAllProducts() {
        return buyService.getAll();
    }

    @ApiOperation(value = "Get a specific buy")
    @GetMapping(value = "/{id}")
    public Buy getBuy(@PathVariable Integer id) {
        return buyService.getById(id);
    }

    @ApiOperation(value = "Delete a specific buy")
    @DeleteMapping(value = "/{id}")
    public void deleteBuy(@PathVariable Integer id) {
        buyService.deleteBuy(id);
    }
}
