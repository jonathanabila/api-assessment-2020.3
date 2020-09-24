package com.assessment.infnet.api.model.services;

import com.assessment.infnet.api.model.models.CoffeeMachine;
import com.assessment.infnet.api.model.repositories.ICoffeeMachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeMachineService {
    @Autowired private ICoffeeMachineRepository coffeeMachineRepository;

    public List<CoffeeMachine> getAll() {
        return (List<CoffeeMachine>) coffeeMachineRepository.findAll(Sort.by(Sort.Direction.ASC, "description"));
    }

    public void addCoffeeMachine(CoffeeMachine coffeeMachine) {
        coffeeMachineRepository.save(coffeeMachine);
    }

    public void deleteCoffeeMachine(Integer id) {
        coffeeMachineRepository.deleteById(id);
    }

    public CoffeeMachine getById(Integer id) {
        return coffeeMachineRepository.findById(id).orElse(null);
    }
}
