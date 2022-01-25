package com.mongo.mongo.controller;

import com.mongo.mongo.model.Wildfire;
import com.mongo.mongo.repository.WildfireRepository;
import com.mongo.mongo.services.WildfireService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class WildfireController {

    @Autowired
    private WildfireRepository wildfireRepository;

    @GetMapping(value = "/{id}")
    public Wildfire getWildfireById(@PathVariable String id) {
        return wildfireRepository.findWildfireBy_id(id);
    }

    @PostMapping(value = "/add")
    public Wildfire addWildfire(@RequestBody Wildfire wildfire) {
        return wildfireRepository.save(wildfire);
    }

    @PutMapping(value="/update/{id}")
    public Wildfire updateWildfire(@PathVariable String id,@RequestBody Wildfire wildfire) {
        return wildfireRepository.save(wildfire);

    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteWildfire(@PathVariable String id) {
        wildfireRepository.deleteById(id);
    }
//    private final WildfireService wildfireService;

//    public List<Wildfire> fetchAllWildfires() {
//        return wildfireService.getAllWildfires();
//    }
}
