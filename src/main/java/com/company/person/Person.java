package com.company.person;

import com.company.location.Location;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Random;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Person extends Location{
    private final String _type;
    private final int _id;
    private final String key;
    private final String name;
    private String fullName;
    private final String iata_airport_code;


    public Person(String name, String country, int location_id, boolean inEurope, String countryCode, boolean coreCountry, String distance) {
        Random rand = new Random();
        this._type = "Position";
        this._id = rand.nextInt(100000);
        this.key="null";
        this.name=name;
        this.iata_airport_code="null";
        this.type="location";
        this.country=country;
        this.fullName = this.name + ", " + this.country;
        this.location_id=location_id;
        this.inEurope=inEurope;
        this.countryCode=countryCode;
        this.coreCountry=coreCountry;
        this.distance=distance;
    }

    public String get_type() {
        return _type;
    }

    public int get_id() {
        return _id;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String country) {
        this.fullName = this.name+", " + country;
    }

    public String getIata_airport_code() {
        return iata_airport_code;
    }
}