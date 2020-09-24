package com.assessment.infnet.api.model.services;

import com.assessment.infnet.api.model.models.Buy;
import com.assessment.infnet.api.model.models.Buyer;
import com.assessment.infnet.api.model.repositories.IBuyRepository;
import com.assessment.infnet.api.model.repositories.IBuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {
    @Autowired private IBuyerRepository buyerRepository;

    public List<Buyer> getAll() {
        return (List<Buyer>) buyerRepository.findAll(Sort.by(Sort.Direction.ASC, "email"));
    }

    public void addBuyer(Buyer buyer) {
        buyerRepository.save(buyer);
    }

    public void deleteBuyer(Integer id) {
        buyerRepository.deleteById(id);
    }

    public Buyer getById(Integer id) {
        return buyerRepository.findById(id).orElse(null);
    }
}
