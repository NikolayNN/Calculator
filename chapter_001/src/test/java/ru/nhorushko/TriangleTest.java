package ru.nhorushko;

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
        Point a = new Point(0, 10);
        Point b = new Point(10, 20);
        Point c = new Point(30, 10);
        Point d = new Point(20, 30);
        rightTriangle = new Triangle(a, b, c);
        wrongTriangle = new Triangle(a, b, d);
    }
    /**
     * The test validate calculated area.
     */
    @Test
    public void area() {
        assertThat(rightTriangle.area(), is(closeTo(149.9999, 0.0001)));
    }

    /**
     * The test catch RuntimeException because attempt calculate area of line.
     */
    @Test(expected = RuntimeException.class)
    public void areaThrowException() {
        wrongTriangle.area();
    }
}