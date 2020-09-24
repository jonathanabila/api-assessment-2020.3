package com.assessment.infnet.api.model.services;

import com.assessment.infnet.api.model.models.Product;
import com.assessment.infnet.api.model.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private IProductRepository productRepository;

    public List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    public Product getById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }
}
