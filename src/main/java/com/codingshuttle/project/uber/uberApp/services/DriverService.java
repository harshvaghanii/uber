package com.codingshuttle.project.uber.uberApp.services;

import com.codingshuttle.project.uber.uberApp.dto.DriverDTO;
import com.codingshuttle.project.uber.uberApp.dto.RideDTO;
import com.codingshuttle.project.uber.uberApp.dto.RiderDTO;

import java.util.List;

public interface DriverService {

    RideDTO acceptRide(Long rideID);

    RideDTO cancelRide(Long rideID);

    RideDTO startRide(Long rideID);

    RideDTO endRide(Long rideID);

    RiderDTO rateRider(Long rideID, Integer rating);

    DriverDTO getMyProfile();

    List<RideDTO> getAllMyRides();

}
