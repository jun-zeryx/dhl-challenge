package com.dhl.challenge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationDTO {
    private LocationDTO from;
    private LocationDTO to;
    private String postcode;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private BigDecimal distance;
    private String unit;
}
