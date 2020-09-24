package com.assessment.infnet.api.model.repositories;

import com.assessment.infnet.api.model.models.CoffeeMachine;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICoffeeMachineRepository extends CrudRepository<CoffeeMachine, Integer> {
    List<CoffeeMachine> findAll(Sort by);
}
