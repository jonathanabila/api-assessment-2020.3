package com.assessment.infnet.api.model.repositories;

import com.assessment.infnet.api.model.models.Buyer;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBuyerRepository extends CrudRepository<Buyer, Integer> {
    List<Buyer> findAll(Sort by);
}
