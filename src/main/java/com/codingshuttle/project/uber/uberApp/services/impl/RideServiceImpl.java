package com.codingshuttle.project.uber.uberApp.services.impl;

import com.codingshuttle.project.uber.uberApp.dto.RideRequestDTO;
import com.codingshuttle.project.uber.uberApp.entities.Driver;
import com.codingshuttle.project.uber.uberApp.entities.Ride;
import com.codingshuttle.project.uber.uberApp.entities.enums.RideStatus;
import com.codingshuttle.project.uber.uberApp.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    @Override
    public Ride getRideByID(Long rideID) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDTO rideRequestDTO) {

    }

    @Override
    public Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideID, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderID, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driverID, PageRequest pageRequest) {
        return null;
    }
}
