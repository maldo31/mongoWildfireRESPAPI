package com.mongo.mongo.services;

import com.mongo.mongo.model.Wildfire;
import com.mongo.mongo.repository.WildfireRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class WildfireService {
    private final WildfireRepository wildfireRepository;
    public List<Wildfire> getAllWildfires() {
        return wildfireRepository.findAll();
    }
}
