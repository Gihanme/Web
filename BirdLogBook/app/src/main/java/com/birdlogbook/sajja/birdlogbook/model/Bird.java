package com.birdlogbook.sajja.birdlogbook.model;

/**
 * Created by dinush on 11/21/2016.
 */

public class Bird {

    public String type;
    public double latitude;
    public double longitude;

    public Bird(String type, double latitude, double longitude) {
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
