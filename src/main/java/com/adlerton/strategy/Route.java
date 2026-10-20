package com.adlerton.strategy;

public record Route(String mode, String origin, String destination, double distanceKm,
                    double durationMinutes, double cost) {
    public Route {
        if (origin == null || origin.isBlank() || destination == null || destination.isBlank()) {
            throw new IllegalArgumentException("Origin and destination must not be blank");
        }
        if (!Double.isFinite(distanceKm) || distanceKm <= 0) {
            throw new IllegalArgumentException("Distance must be a positive finite number");
        }
    }
}
