package com.dhl.challenge.service;

import java.math.BigDecimal;

public interface PostcodeCalculator {
    BigDecimal calculateDistance(Double lat1, Double lon1, Double lat2, Double lon2);
}
