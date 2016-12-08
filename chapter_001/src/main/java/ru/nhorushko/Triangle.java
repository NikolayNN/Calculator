package ru.nhorushko;

/**
 * The class {@code Triangle} contains methods for calculate
 * area of triangle. Triangle creates with constructor by three points.
 * The class has check if point coordinates wrong. In this case throw {@code RuntimeException}
 */
public class Triangle {
    /**
     * first corner of a triangle.
     */
    public Point a;
    /**
     * second corner of a triangle.
     */
    public Point b;
    /**
     * third corner of a triangle.
     */
    public Point c;

    /**
     * The constructor create triangle by three points.
     * @param a first corner
     * @param b second corner
     * @param c third corner of a triangle
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Calculate triangle's area.
     * @return area
     * @throws RuntimeException if point wrong and impossible build triangle by them.
     */
    public double area() throws RuntimeException {
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ac = a.distanceTo(c);
        double halfPer = (ab + bc + ac) / 2;
        double area = Math.sqrt(halfPer * (halfPer - ab) * (halfPer - bc) * (halfPer - ac));
        if (area <= 0) {
            throw new RuntimeException("it is imposible draw triangle across points " + a + " " + b + " " + c);
        }
        return area;
    }
}
