package ru.nhorushko.part3;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;


/**
 * The class contains tests for class Triangle.
 */
public class TriangleTest {
    /**
     * the field contains triangle.
     */

    private Triangle rightTriangle;
    /**
     * the field contains straight line by three points.
     */
    private Triangle wrongTriangle;

    /**
     * The method create instances for tests.
     */
    @Before
    public void setup() {
        final double xCoordinateA = 0;
        final double yCoordinateA = 10;
        final double xCoordinateB = 10;
        final double yCoordinateB = 20;
        final double xCoordinateC = 30;
        final double yCoordinateC = 10;
        final double xCoordinateD = 20;
        final double yCoordinateD = 30;
        Point a = new Point(xCoordinateA, yCoordinateA);
        Point b = new Point(xCoordinateB, yCoordinateB);
        Point c = new Point(xCoordinateC, yCoordinateC);
        Point d = new Point(xCoordinateD, yCoordinateD);
        rightTriangle = new Triangle(a, b, c);
        wrongTriangle = new Triangle(a, b, d);
    }

    /**
     * The test validate calculated area.
     */
    @Test
    public void area() {
        final double expectedArea = 149.9999;
        final double admissibleError = 0.0001;
        assertThat(rightTriangle.area(), is(closeTo(expectedArea, admissibleError)));
    }

    /**
     * The test catch RuntimeException because attempt calculate area of line.
     */
    @Test(expected = RuntimeException.class)
    public void areaThrowException() {
        wrongTriangle.area();
    }
}