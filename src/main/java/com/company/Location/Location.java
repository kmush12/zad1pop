package com.company.Location;

public class Location {
    protected String type;
    protected String country;
    protected randomGeoPosition geoPosition;
    protected int location_id;
    protected boolean inEurope;
    protected String countryCode;
    protected boolean coreCountry;
    protected String distance;


    public String getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public randomGeoPosition getGeo_position() {
        return geoPosition;
    }

    public int getLocation_id() {
        return location_id;
    }

    public boolean isInEurope() {
        return inEurope;
    }


    public String getCountryCode() {
        return countryCode;
    }

    public boolean isCoreCountry() {
        return coreCountry;
    }

    public String getDistance() {
        return distance;
    }
}