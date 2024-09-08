package com.codingshuttle.project.uber.uberApp.services;

import com.codingshuttle.project.uber.uberApp.dto.DriverDTO;
import com.codingshuttle.project.uber.uberApp.dto.RideDTO;
import com.codingshuttle.project.uber.uberApp.dto.RiderDTO;
import com.codingshuttle.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverService {

    RideDTO acceptRide(Long rideRequestID);

    RideDTO cancelRide(Long rideID);

    RideDTO startRide(Long rideID, String otp);

    RideDTO endRide(Long rideID);

    RiderDTO rateRider(Long rideID, Integer rating);

    DriverDTO getMyProfile();

    List<RideDTO> getAllMyRides();

    Driver getCurrentDriver();
}
