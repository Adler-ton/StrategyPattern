package com.adlerton.strategy;

import java.util.Objects;

public final class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "Strategy is required");
    }

    public Route planRoute(String origin, String destination, double distanceKm) {
        return strategy.planRoute(origin, destination, distanceKm);
    }
}
