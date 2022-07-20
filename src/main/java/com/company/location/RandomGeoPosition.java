package com.company.location;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGeoPosition {

    private final double latitude ;
    private final double longitude;


    public RandomGeoPosition() {

        double minLatitude = -90;
        double maxLatitude = 90;
        this.latitude = coordinatesFormat(minLatitude, maxLatitude);
        double minLongitude = 0;
        double maxLongitude = 180;
        this.longitude = coordinatesFormat(minLongitude, maxLongitude);
    }

    private double coordinatesFormat(double minCoordinates, double maxCoordinates) {
        return Double.parseDouble(geoCoordinatesFormat.format(randomCoordinates(minCoordinates, maxCoordinates)));
    }

    private final DecimalFormat geoCoordinatesFormat = new DecimalFormat("##.#######");

    private double randomCoordinates(double minCoordinates, double maxCoordinates) {
        return ThreadLocalRandom.current().nextDouble((minCoordinates), (maxCoordinates +1));
    }

    public double getLatitude() {return latitude;}

    public double getLongitude() {
        return longitude;
    }

}
