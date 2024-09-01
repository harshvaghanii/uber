package com.codingshuttle.project.uber.uberApp.services;

import com.codingshuttle.project.uber.uberApp.dto.RideRequestDTO;
import com.codingshuttle.project.uber.uberApp.entities.Driver;
import com.codingshuttle.project.uber.uberApp.entities.Ride;
import com.codingshuttle.project.uber.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideByID(Long rideID);

    void matchWithDrivers(RideRequestDTO rideRequestDTO);

    Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver);

    Ride updateRideStatus(Long rideID, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderID, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverID, PageRequest pageRequest);

}
