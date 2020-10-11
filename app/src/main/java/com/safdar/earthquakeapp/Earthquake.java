package com.safdar.earthquakeapp;

public class Earthquake {

    private final String mUrl;
    private double mMagnitude;
    private String mLocation;
    private long timeInMilliseconds;

    public Earthquake(double mMagnitude, String mLocation, long timeInMilliseconds,String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.timeInMilliseconds = timeInMilliseconds;
        this.mUrl = mUrl;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setmMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public void setTimeInMilliseconds(long timeInMilliseconds) {
        this.timeInMilliseconds = timeInMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }
}
