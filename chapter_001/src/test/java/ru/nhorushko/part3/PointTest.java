package ru.nhorushko.part3;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;


/**
 * The class {@code PointTest} contains Tests for class {@code Point}.
 */
public class PointTest {
    /**
     * first point.
     */
    private Point a;
    /**
     * second point.
     */
    private Point b;

    /**
     * the method create instances for points.
     */
    @Before
    public void setup() {
        final double xCoordinateA = 0;
        final double yCoordinateA = 10;
        final double xCoordinateB = 20;
        final double yCoordinateB = 30;
        a = new Point(xCoordinateA, yCoordinateA);
        b = new Point(xCoordinateB, yCoordinateB);
    }

    /**
     * The Test is validity calculated distance between two points.
     */
    @Test
    public void distanceToOtherPoint() {
        final double expectedDistance = 28.2842;
        final double admissibleError = 0.0001;
        assertThat(a.distanceTo(b), is(closeTo(expectedDistance, admissibleError)));
    }

    /**
     * The Test is validity calculated distance between one point.
     */
    @Test
    public void distanceToTheSamePoint() {
        final double expectedDistance = 0;
        final double admissibleError = 0.0001;
        assertThat(a.distanceTo(a), is(closeTo(expectedDistance, admissibleError)));
    }

}