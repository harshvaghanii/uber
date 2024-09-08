package com.codingshuttle.project.uber.uberApp.controllers;

import com.codingshuttle.project.uber.uberApp.dto.RideDTO;
import com.codingshuttle.project.uber.uberApp.dto.RideStartDto;
import com.codingshuttle.project.uber.uberApp.services.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/driver")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService driverService;

    @PostMapping(path = "/acceptRide/{rideRequestID}")
    public ResponseEntity<RideDTO> acceptRide(@PathVariable Long rideRequestID) {
        return ResponseEntity.ok(driverService.acceptRide(rideRequestID));
    }

    @PostMapping(path = "/startRide/{rideRequestID}")
    public ResponseEntity<RideDTO> startRide(@PathVariable Long rideRequestID,
                                             @RequestBody RideStartDto rideStartDto) {
        return ResponseEntity.ok(driverService.startRide(rideRequestID, rideStartDto.getOtp()));
    }

}
