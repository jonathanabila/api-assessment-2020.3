package com.assessment.infnet.api.model.repositories;

import com.assessment.infnet.api.model.models.Keyboard;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IKeyboardRepository extends CrudRepository<Keyboard, Integer> {
    List<Keyboard> findAll(Sort by);
}
