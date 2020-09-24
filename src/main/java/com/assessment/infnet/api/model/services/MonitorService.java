package com.assessment.infnet.api.model.services;

import com.assessment.infnet.api.model.models.Monitor;
import com.assessment.infnet.api.model.repositories.IMonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorService {
    @Autowired private IMonitorRepository monitorRepository;

    public List<Monitor> getAll() {
        return (List<Monitor>) monitorRepository.findAll(Sort.by(Sort.Direction.ASC, "description"));
    }

    public void addMonitor(Monitor monitor) {
        monitorRepository.save(monitor);
    }

    public void deleteMonitor(Integer id) {
        monitorRepository.deleteById(id);
    }

    public Monitor getById(Integer id) {
        return monitorRepository.findById(id).orElse(null);
    }
}
