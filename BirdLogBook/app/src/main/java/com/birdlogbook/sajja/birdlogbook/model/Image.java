package com.birdlogbook.sajja.birdlogbook.model;

import java.sql.Time;
import java.sql.Date;

/**
 * Created by sajja on 9/7/2016.
 */
public class Image {
    private int IID;
    private String photoDir;
    private double xI;
    private double yI;
    private String date;
    private String time;

    public Image() {
    }

    public Image(int IID, String photoDir, double xI, double yI, String date, String time) {
        this.IID = IID;
        this.photoDir = photoDir;
        this.xI = xI;
        this.yI = yI;
        this.date = date;
        this.time = time;
    }

    public Image(String photoDir, double xI, double yI, String date, String time) {
        this.photoDir = photoDir;
        this.xI = xI;
        this.yI = yI;
        this.date = date;
        this.time = time;
    }

    public int getIID() {
        return IID;
    }

    public void setIID(int IID) {
        this.IID = IID;
    }

    public String getphotoDir() {
        return photoDir;
    }

    public void setphotoDir(String photo) {
        this.photoDir = photo;
    }

    public double getxI() {
        return xI;
    }

    public void setxI(double xI) {
        this.xI = xI;
    }

    public double getyI() {
        return yI;
    }

    public void setyI(double yI) {
        this.yI = yI;
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

}
