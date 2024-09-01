package com.codingshuttle.project.uber.uberApp.strategies;

import com.codingshuttle.project.uber.uberApp.dto.RideRequestDTO;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDTO rideRequestDTO);

}
