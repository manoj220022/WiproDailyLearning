package com.example.wipro.controllers;

import com.example.wipro.entities.House;
import com.example.wipro.enums.Facility;
import com.example.wipro.services.PropertyHouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/houses")
@RequiredArgsConstructor
public class PropertyController {

    private final PropertyHouseService houseService;

    @GetMapping
    public List<House> getAllHouses() {
        return houseService.getAllHouses();
    }

    @GetMapping("/{id}")
    public House getHouseById(@PathVariable("id") Long id) {
        return houseService.getHouseById(id);
    }

    @GetMapping("/facility/{facility}")
    public List<House> getHousesByFacility(@PathVariable Facility facility) {
        return houseService.getHousesByFacility(facility);
    }

    @PostMapping
    public House createHouse(@RequestBody House house) {
        return houseService.createHouse(house);
    }

    @PutMapping("/{id}")
    public House updateHouse(@PathVariable Long id, @RequestBody House house) {
        return houseService.updateHouse(id, house);
    }

    @DeleteMapping("/{id}")
    public void deleteHouse(@PathVariable Long id) {
        houseService.deleteHouse(id);
    }
}
