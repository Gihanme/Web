package com.birdlogbook.sajja.birdlogbook.model;

import java.sql.Date;
import java.sql.Time;

/**
 * Created by sajja on 9/7/2016.
 */
public class LogNote {
    private int lNID;
    private int iID;
    private String date;
    private String time;
    private String province;
    private String nearestCity;
    private double lX;
    private double lY;
    private double temperature;
    private String elevation;
    private String habitat;
    private String name;
    private String looksLike;
    private double sizeWidth;
    private double sizeHight;
    private String shape;
    private String colour;
    private String behaviour;
    private String otherNote;

    public LogNote() {
    }

    public LogNote(int lNID, int iID, String date, String time, String province, String nearestCity, double lX, double lY, double temperature, String elevation, String habitat, String name, String looksLike, double sizeWidth, double sizeHight, String shape, String colour, String behaviour, String otherNote) {
        this.lNID = lNID;
        this.iID = iID;
        this.date = date;
        this.time = time;
        this.province = province;
        this.nearestCity = nearestCity;
        this.lX = lX;
        this.lY = lY;
        this.temperature = temperature;
        this.elevation = elevation;
        this.habitat = habitat;
        this.name = name;
        this.looksLike = looksLike;
        this.sizeWidth = sizeWidth;
        this.sizeHight = sizeHight;
        this.shape = shape;
        this.colour = colour;
        this.behaviour = behaviour;
        this.otherNote = otherNote;
    }

    public LogNote(int iID, String date, String time, String province, String nearestCity, double lX, double lY, double temperature, String elevation, String habitat, String name, String looksLike, double sizeWidth, double sizeHight, String shape, String colour, String behaviour, String otherNote) {
        this.iID = iID;
        this.date = date;
        this.time = time;
        this.province = province;
        this.nearestCity = nearestCity;
        this.lX = lX;
        this.lY = lY;
        this.temperature = temperature;
        this.elevation = elevation;
        this.habitat = habitat;
        this.name = name;
        this.looksLike = looksLike;
        this.sizeWidth = sizeWidth;
        this.sizeHight = sizeHight;
        this.shape = shape;
        this.colour = colour;
        this.behaviour = behaviour;
        this.otherNote = otherNote;
    }

    public int getlNID() {
        return lNID;
    }

    public void setlNID(int lNID) {
        this.lNID = lNID;
    }

    public int getiID() {
        return iID;
    }

    public void setiID(int iID) {
        this.iID = iID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getNearestCity() {
        return nearestCity;
    }

    public void setNearestCity(String nearestCity) {
        this.nearestCity = nearestCity;
    }

    public double getlX() {
        return lX;
    }

    public void setlX(double lX) {
        this.lX = lX;
    }

    public double getlY() {
        return lY;
    }

    public void setlY(double lY) {
        this.lY = lY;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLooksLike() {
        return looksLike;
    }

    public void setLooksLike(String looksLike) {
        this.looksLike = looksLike;
    }

    public double getSizeWidth() {
        return sizeWidth;
    }

    public void setSizeWidth(double sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    public double getSizeHight() {
        return sizeHight;
    }

    public void setSizeHight(double sizeHight) {
        this.sizeHight = sizeHight;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getOtherNote() {
        return otherNote;
    }

    public void setOtherNote(String otherNote) {
        this.otherNote = otherNote;
    }

    @Override
    public String toString() {
        return "LogNote{" +
                "lNID=" + lNID +
                ", iID=" + iID +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", province='" + province + '\'' +
                ", nearestCity='" + nearestCity + '\'' +
                ", lX=" + lX +
                ", lY=" + lY +
                ", temperature=" + temperature +
                ", elevation='" + elevation + '\'' +
                ", habitat='" + habitat + '\'' +
                ", name='" + name + '\'' +
                ", looksLike='" + looksLike + '\'' +
                ", sizeWidth=" + sizeWidth +
                ", sizeHight=" + sizeHight +
                ", shape='" + shape + '\'' +
                ", colour='" + colour + '\'' +
                ", behaviour='" + behaviour + '\'' +
                ", otherNote='" + otherNote + '\'' +
                '}';
    }
}
