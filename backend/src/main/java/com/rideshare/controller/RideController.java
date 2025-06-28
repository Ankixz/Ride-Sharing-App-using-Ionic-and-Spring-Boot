package com.rideshare.controller;

import com.rideshare.model.Ride;
import com.rideshare.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rides")
@CrossOrigin(origins = "*")
public class RideController {

    @Autowired
    private RideRepository rideRepository;

    @PostMapping
    public Ride requestRide(@RequestBody Ride ride) {
        ride.setStatus("REQUESTED");
        return rideRepository.save(ride);
    }

    @GetMapping
    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }

    @PutMapping("/{id}/status")
    public Ride updateRideStatus(@PathVariable String id, @RequestBody Ride updatedRide) {
        Ride ride = rideRepository.findById(id).orElse(null);
        if (ride != null) {
            ride.setStatus(updatedRide.getStatus());
            return rideRepository.save(ride);
        }
        return null;
    }
}
