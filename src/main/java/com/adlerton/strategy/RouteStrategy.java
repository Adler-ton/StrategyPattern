package com.adlerton.strategy;

public interface RouteStrategy {
    Route planRoute(String origin, String destination, double distanceKm);
}
