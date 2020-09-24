package com.assessment.infnet.api.model.repositories;

import com.assessment.infnet.api.model.models.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findAll(Sort by);
}
