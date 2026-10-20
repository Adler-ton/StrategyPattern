package com.adlerton.strategy;

public final class CycleStrategy implements RouteStrategy {
    @Override
    public Route planRoute(String origin, String destination, double distanceKm) {
        return new Route("Cycle", origin, destination, distanceKm, distanceKm / 15 * 60, 0);
    }
}
