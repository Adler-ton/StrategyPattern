package com.adlerton.strategy;

public final class Main {
    private Main() { }

    public static void main(String[] args) {
        Navigator navigator = new Navigator(new CarStrategy());
        printRoute(navigator.planRoute("Campus", "Library", 10));
        navigator.setStrategy(new WalkStrategy());
        printRoute(navigator.planRoute("Campus", "Library", 10));
        navigator.setStrategy(new CycleStrategy());
        printRoute(navigator.planRoute("Campus", "Library", 10));
    }

    private static void printRoute(Route route) {
        System.out.printf("%s: %s -> %s | %.1f km | %.1f min | cost %.2f%n",
                route.mode(), route.origin(), route.destination(), route.distanceKm(),
                route.durationMinutes(), route.cost());
    }
}
