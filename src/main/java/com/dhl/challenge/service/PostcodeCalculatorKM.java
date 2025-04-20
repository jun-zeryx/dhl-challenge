package com.dhl.challenge.service;

import java.math.BigDecimal;

public class PostcodeCalculatorKM implements PostcodeCalculator {

    @Override
    public BigDecimal calculateDistance(Double lat1, Double lon1, Double lat2, Double lon2) {

        double NAUTICAL_MILES = 1.1515;
        double KM_IN_MILES = 1.609344;

        double theta = lon1 - lon2;
        double dist = Math.acos(
                Math.sin(Math.toRadians(lat1)) *
                Math.sin(Math.toRadians(lat2)) +
                Math.cos(Math.toRadians(lat1)) *
                Math.cos(Math.toRadians(lat2)) *
                Math.cos(Math.toRadians(theta))
        );

        dist = Math.toDegrees(dist);
        dist = dist * 60;

        return new BigDecimal(dist * NAUTICAL_MILES * KM_IN_MILES);
    }
}
