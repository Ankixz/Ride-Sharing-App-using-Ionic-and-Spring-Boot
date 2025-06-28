package com.rideshare.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rides")
public class Ride {

    @Id
    private String id;
    private String passengerName;
    private String pickupLocation;
    private String dropoffLocation;
    private String driverId;
    private String status; // e.g., REQUESTED, ACCEPTED, COMPLETED

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
       this.id = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
       this.passengerName = passengerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
       this.pickupLocation = pickupLocation;
    }

    public String getDropoffLocation() {
        return dropoffLocation;
    }

    public void setDropoffLocation(String dropoffLocation) {
       this.dropoffLocation = dropoffLocation;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
       this.driverId = driverId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
       this.status = status;
    }
}