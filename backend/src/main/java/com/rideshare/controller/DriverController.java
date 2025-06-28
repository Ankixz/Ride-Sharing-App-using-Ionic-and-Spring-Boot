package com.rideshare.controller;

import com.rideshare.model.Driver;
import com.rideshare.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
@CrossOrigin(origins = "*")
public class DriverController {

    @Autowired
    private DriverRepository driverRepository;

    @PostMapping
    public Driver addDriver(@RequestBody Driver driver) {
        return driverRepository.save(driver);
    }

    @GetMapping
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    @GetMapping("/{id}")
    public Driver getDriverById(@PathVariable String id) {
        return driverRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}/location")
    public Driver updateLocation(@PathVariable String id, @RequestBody Driver updatedDriver) {
        Driver driver = driverRepository.findById(id).orElse(null);
        if (driver != null) {
            driver.setLatitude(updatedDriver.getLatitude());
            driver.setLongitude(updatedDriver.getLongitude());
            return driverRepository.save(driver);
        }
        return null;
    }
}
