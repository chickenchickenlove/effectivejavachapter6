package com.example.effetivejavachapter6.item34;

public enum Planet {

    MERCURY(3.302e+23, 2.439e6),
    VENUS(4.869e+24, 6.052e6),
    EARTH(5.975e+24, 6.378e6);


    private final double mass;
    private final double radius;
    private final double surfaceGravity;

    private static final double G = 6.67330E-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G * mass / (radius * radius);
    }

    public double mass() {
        return this.mass;
    }

    public double radius() {
        return this.radius;
    }

    public double surfaceGravity() {
        return this.surfaceGravity;
    }

    public double surfaceWeight(double mass) {
        return mass * this.surfaceGravity;
    }

    public static void main(String[] args) {

    }
}
