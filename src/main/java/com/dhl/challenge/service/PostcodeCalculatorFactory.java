package com.dhl.challenge.service;

public abstract class PostcodeCalculatorFactory {
    public static PostcodeCalculator getPostcodeCalculatorByType(String type) {
        if (type.equalsIgnoreCase("KM")) {
            return new PostcodeCalculatorKM();
        }  else {
            return new PostcodeCalculatorKM();
        }
    }
}
