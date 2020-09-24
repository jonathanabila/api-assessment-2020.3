package com.assessment.infnet.api.model.services;

import com.assessment.infnet.api.model.models.Keyboard;
import com.assessment.infnet.api.model.repositories.IKeyboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyboardService {
    @Autowired private IKeyboardRepository keyboardRepository;

    public List<Keyboard> getAll() {
        return (List<Keyboard>) keyboardRepository.findAll(Sort.by(Sort.Direction.ASC, "description"));
    }

    public void addKeyboard(Keyboard keyboard) {
        keyboardRepository.save(keyboard);
    }

    public void deleteKeyboard(Integer id) {
        keyboardRepository.deleteById(id);
    }

    public Keyboard getById(Integer id) {
        return keyboardRepository.findById(id).orElse(null);
    }
}
