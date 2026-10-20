package com.adlerton.strategy;

public final class CarStrategy implements RouteStrategy {
    @Override
    public Route planRoute(String origin, String destination, double distanceKm) {
        return new Route("Car", origin, destination, distanceKm, distanceKm / 50 * 60,
                distanceKm * 0.12);
    }
}
