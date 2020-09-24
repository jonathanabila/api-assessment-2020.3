package com.assessment.infnet.api.model.repositories;

import com.assessment.infnet.api.model.models.Buy;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBuyRepository extends CrudRepository<Buy, Integer> {
    List<Buy> findAll(Sort by);
}
