package com.codingshuttle.project.uber.uberApp.strategies;

import com.codingshuttle.project.uber.uberApp.strategies.impl.DriverMatchingHighestRatedDriverStrategy;
import com.codingshuttle.project.uber.uberApp.strategies.impl.DriverMatchingNearestDriverStrategy;
import com.codingshuttle.project.uber.uberApp.strategies.impl.RideFareDefaultFareCalculationStrategy;
import com.codingshuttle.project.uber.uberApp.strategies.impl.RideFareSurgePricingFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@RequiredArgsConstructor
public class RideStrategyManager {

    private final DriverMatchingNearestDriverStrategy driverMatchingNearestDriverStrategy;
    private final DriverMatchingHighestRatedDriverStrategy driverMatchingHighestRatedDriverStrategy;
    private final RideFareDefaultFareCalculationStrategy rideFareDefaultFareCalculationStrategy;
    private final RideFareSurgePricingFareCalculationStrategy rideFareSurgePricingFareCalculationStrategy;

    public DriverMatchingStrategy driverMatchingStrategy(double riderRating) {
        if (riderRating >= 4.8) {
            return this.driverMatchingHighestRatedDriverStrategy;
        }
        return this.driverMatchingNearestDriverStrategy;
    }

    public RideFareCalculationStrategy rideFareCalculationStrategy() {

        // PEAK HOUR - 6PM - 9PM
        LocalTime surgeStart = LocalTime.of(18, 0);
        LocalTime surgeEnd = LocalTime.of(21, 0);
        LocalTime currentTime = LocalTime.now();

        boolean isSurgeTime = currentTime.isAfter(surgeStart) && currentTime.isBefore(surgeEnd);

        return isSurgeTime ? this.rideFareSurgePricingFareCalculationStrategy : this.rideFareDefaultFareCalculationStrategy;

    }

}
