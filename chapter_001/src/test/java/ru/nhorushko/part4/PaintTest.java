package ru.nhorushko.part4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The test contains tests for class Paint.
 *
 * @author Nikolay Horushko
 */
public class PaintTest {
    /**
     * Create entity for test.
     */
    private Paint paint;

    /**
     * Create entity for test.
     */
    @Before
    public void setup() {
        paint = new Paint();
    }

    /**
     * If pyramid height positive number.
     */
    @Test
    public void drawPiramid() {
        final int pyramidHeight = 5;
        String expectedPyramid = "    ^ \n"
                + "   ^ ^ \n"
                + "  ^ ^ ^ \n"
                + " ^ ^ ^ ^ \n"
                + "^ ^ ^ ^ ^ \n";
        assertEquals(expectedPyramid, paint.drawPiramid(pyramidHeight));
    }

    /**
     * If pyramid height negative number.
     */
    @Test
    public void drawPiramidNegativeHeight() {
        final int pyramidHeight = -5;
        String expectedPyramid = "    ^ \n"
                + "   ^ ^ \n"
                + "  ^ ^ ^ \n"
                + " ^ ^ ^ ^ \n"
                + "^ ^ ^ ^ ^ \n";
        assertEquals(expectedPyramid, paint.drawPiramid(pyramidHeight));
    }

    /**
     * If pyramid height = 0.
     */
    @Test
    public void drawPiramidZeroHeight() {
        final int pyramidHeight = 0;
        String expectedPyramid = "";
        assertEquals(expectedPyramid, paint.drawPiramid(pyramidHeight));
    }
}