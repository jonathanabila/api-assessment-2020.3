package com.assessment.infnet.api.controllers;

import com.assessment.infnet.api.model.models.Monitor;
import com.assessment.infnet.api.model.services.MonitorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product/monitor")
public class MonitorController {

    @Autowired
    private MonitorService monitorService;

    @ApiOperation(value = "Get all monitors")
    @GetMapping(value = "/")
    public List<Monitor> getAllMonitors() {
        return monitorService.getAll();
    }

    @ApiOperation(value = "Get a specific monitor")
    @GetMapping(value = "/{id}")
    public Monitor getKeyboard(@PathVariable Integer id) {
        return monitorService.getById(id);
    }
}
