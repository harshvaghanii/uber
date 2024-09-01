package com.codingshuttle.project.uber.uberApp.services.impl;

import com.codingshuttle.project.uber.uberApp.dto.DriverDTO;
import com.codingshuttle.project.uber.uberApp.dto.RideDTO;
import com.codingshuttle.project.uber.uberApp.dto.RiderDTO;
import com.codingshuttle.project.uber.uberApp.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDTO acceptRide(Long rideID) {
        return null;
    }

    @Override
    public RideDTO cancelRide(Long rideID) {
        return null;
    }

    @Override
    public RideDTO startRide(Long rideID) {
        return null;
    }

    @Override
    public RideDTO endRide(Long rideID) {
        return null;
    }

    @Override
    public RiderDTO rateRider(Long rideID, Integer rating) {
        return null;
    }

    @Override
    public DriverDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return List.of();
    }
}
