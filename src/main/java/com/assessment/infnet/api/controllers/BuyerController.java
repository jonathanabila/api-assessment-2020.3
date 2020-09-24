package com.assessment.infnet.api.controllers;

import com.assessment.infnet.api.model.models.Buyer;
import com.assessment.infnet.api.model.services.BuyerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buyer")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @ApiOperation(value = "Add a new buyer")
    @PostMapping(value = "/add")
    public void addBuyer(@RequestBody Buyer buyer) {
        buyerService.addBuyer(buyer);
    }

    @ApiOperation(value = "Get all buyers")
    @GetMapping(value = "/")
    public List<Buyer> getAllBuyers() {
        return buyerService.getAll();
    }

    @ApiOperation(value = "Get a specific buyer")
    @GetMapping(value = "/{id}")
    public Buyer getBuyer(@PathVariable Integer id) {
        return buyerService.getById(id);
    }

    @ApiOperation(value = "Delete a specific buyer")
    @DeleteMapping(value = "/{id}")
    public void deleteBuyer(@PathVariable Integer id) {
        buyerService.deleteBuyer(id);
    }
}
