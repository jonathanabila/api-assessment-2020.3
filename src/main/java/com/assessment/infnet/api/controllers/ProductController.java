package com.assessment.infnet.api.controllers;

import com.assessment.infnet.api.model.models.Product;
import com.assessment.infnet.api.model.services.ProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "Add a new product")
    @PostMapping(value = "/add")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @ApiOperation(value = "Get all products")
    @GetMapping(value = "/")
    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    @ApiOperation(value = "Get a specific product")
    @GetMapping(value = "/{id}")
    public Product getProduct(@PathVariable Integer id) {
        return productService.getById(id);
    }

    @ApiOperation(value = "Delete a specific product")
    @DeleteMapping(value = "/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }
}
