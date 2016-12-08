package ru.nhorushko;

import java.util.ArrayList;

/**
 * The class {@code Point} contains methods for calculate
 * distance between two points.
 */

public class Point {
    /**
     * The {@code double} value that is horizontal
     * coordinate of the point.
     */
    public double x;
    /**
     * The {@code double} value that is vertical
     * coordinate of the point.
     */
    public double y;


    /**
     * Constructs a point with specific coordinates.
     * @param x horizontal coordinate
     * @param y vertical coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Calculate distance between this Point and {@param point}.
     * @return distance between points.
     */
    public double distanceTo(Point point) {
        double projectionX = Math.abs(x - point.x);
        double projectionY = Math.abs(y - point.y);
        return Math.sqrt(projectionX * projectionX + projectionY * projectionY);
    }

    /**
     * @return Point description.
     */
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
