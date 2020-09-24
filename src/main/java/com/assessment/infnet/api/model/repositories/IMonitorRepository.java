package com.assessment.infnet.api.model.repositories;

import com.assessment.infnet.api.model.models.Monitor;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMonitorRepository extends CrudRepository<Monitor, Integer> {
    List<Monitor> findAll(Sort by);
}
