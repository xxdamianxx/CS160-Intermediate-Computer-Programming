/*
 *  Distance Formula
 *  This program calculates the distance of two points on a Cartessian plane
 *  CS160-3
 *  September 14, 2023
 *  @author Pedro Damian Sanchez Jr
 */

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public static double cartDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
}