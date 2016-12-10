package ru.nhorushko.part4;

/**
 * This class contains method that draw pseudo graphic pyramid.
 *
 * @author Nikolay Horushko
 */
public class Paint {
    /**
     * Element for draw pyramid.
     */
    private static final String PYRAMID_ELEMENT = "^ ";

    /**
     * The method draw pyramid from {@code PYRAMID_ELEMENT}.
     * If height is negative - convert to positive number.
     *
     * @param height levels amount
     * @return pyramid
     */
    public String drawPiramid(int height) {
        height = Math.abs(height);
        StringBuilder pyramide = new StringBuilder();
        for (int level = 1; level <= height; level++) {
            drawPyramidLevel(pyramide, level, height);
        }
        return pyramide.toString();
    }

    /**
     * Draw pyramid level with spaces and pyramid elements.
     * @param pyramide pyramid
     * @param level current level
     * @param height pyramid height
     */
    private void drawPyramidLevel(StringBuilder pyramide, int level, int height) {
        addSpaces(pyramide, level, height);
        addPyramidElements(pyramide, level);
        pyramide.append("\n");
    }

    /**
     * Add in the current level pyramid elements.
     * @param pyramide pyramide
     * @param level current level
     */
    private void addPyramidElements(StringBuilder pyramide, int level) {
        for (int i = 0; i < level; i++) {
            pyramide.append(PYRAMID_ELEMENT);
        }
    }

    /**
     * Add in the current level space elements.
     * @param pyramid pyramide
     * @param level current level
     * @param height pyramide height
     */
    private void addSpaces(StringBuilder pyramid, int level, int height) {
        int spacesCount = height - level;
        for (int i = 0; i < spacesCount; i++) {
            pyramid.append(" ");
        }
    }
}
