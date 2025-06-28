package com.rideshare.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "drivers")
public class Driver {

    @Id
    private String id;
    private String name;
    private String phone;
    private String vehicleNumber;
    private double latitude;
    private double longitude;

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
       this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
       this.phone = phone;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
       this.vehicleNumber = vehicleNumber;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
       this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
       this.longitude = longitude;
    }
}