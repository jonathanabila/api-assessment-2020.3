package com.assessment.infnet.api.model.services;

import com.assessment.infnet.api.model.models.Buy;
import com.assessment.infnet.api.model.repositories.IBuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyService {
    @Autowired private IBuyRepository buyRepository;

    public List<Buy> getAll() {
        return (List<Buy>) buyRepository.findAll(Sort.by(Sort.Direction.DESC, "date"));
    }

    public void addBuy(Buy buy) {
        buyRepository.save(buy);
    }

    public void deleteBuy(Integer id) {
        buyRepository.deleteById(id);
    }

    public Buy getById(Integer id) {
        return buyRepository.findById(id).orElse(null);
    }
}
