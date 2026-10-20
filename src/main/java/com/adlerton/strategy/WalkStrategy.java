package com.adlerton.strategy;

public final class WalkStrategy implements RouteStrategy {
    @Override
    public Route planRoute(String origin, String destination, double distanceKm) {
        return new Route("Walk", origin, destination, distanceKm, distanceKm / 5 * 60, 0);
    }
}
