package com.dhl.challenge.service;


import com.dhl.challenge.dto.LocationDTO;
import com.dhl.challenge.dto.PostcodeDTO;
import com.dhl.challenge.model.Postcode;
import com.dhl.challenge.repository.PostcodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class PostcodeService {

    private final PostcodeRepository postcodeRepository;

    public LocationDTO calculateDistance(PostcodeDTO requestDTO) {
        Postcode fromPostcode = postcodeRepository.findByPostcode(requestDTO.getFromPostcode()).orElseThrow();
        Postcode toPostcode = postcodeRepository.findByPostcode(requestDTO.getToPostcode()).orElseThrow();

        PostcodeCalculator postcodeUK = PostcodeCalculatorFactory.getPostcodeCalculatorByType("KM");
        BigDecimal distance = postcodeUK.calculateDistance(
                fromPostcode.getLatitude().doubleValue(),
                fromPostcode.getLongitude().doubleValue(),
                toPostcode.getLatitude().doubleValue(),
                toPostcode.getLongitude().doubleValue()
        );

        LocationDTO fromDTO = new LocationDTO();
        fromDTO.setPostcode(fromPostcode.getPostcode());
        fromDTO.setLongitude(fromPostcode.getLongitude());
        fromDTO.setLatitude(fromPostcode.getLatitude());

        LocationDTO toDTO = new LocationDTO();
        toDTO.setPostcode(toPostcode.getPostcode());
        toDTO.setLongitude(toPostcode.getLongitude());
        toDTO.setLatitude(toPostcode.getLatitude());

        LocationDTO responseDTO = new LocationDTO();
        responseDTO.setFrom(fromDTO);
        responseDTO.setTo(toDTO);
        responseDTO.setDistance(distance);
        responseDTO.setUnit("KM");

        return responseDTO;
    }
}
