package com.dhl.challenge.controller;

import com.dhl.challenge.dto.LocationDTO;
import com.dhl.challenge.dto.PostcodeDTO;
import com.dhl.challenge.service.PostcodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postcode")
@RequiredArgsConstructor
@CrossOrigin
public class PostcodeController {

    private final PostcodeService postcodeService;

    @PostMapping("/calculate")
    public ResponseEntity<LocationDTO> createUser(@RequestBody PostcodeDTO request) {
        return new ResponseEntity<>(postcodeService.calculateDistance(request), HttpStatus.OK);
    }
}
