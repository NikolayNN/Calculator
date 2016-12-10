package ru.nhorushko.part3;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
 * The class {@code PointTest} contains Tests for class {@code Point}.
 */
public class PointTest {
    /**
     * first point.
     */
    Point a;
    /**
     * second point.
     */
    Point b;

    /**
     * the method create instances for points.
     */
    @Before
    public void setup(){
        a = new Point(0, 10);
        b = new Point(20, 30);
    }

    /**
     * The Test is validity calculated distance between points.
     */
    @Test
    public void distanceTo() {
        assertThat(a.distanceTo(b), is(closeTo(28.2842, 0.0001)));
    }

}