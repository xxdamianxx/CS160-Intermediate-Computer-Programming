/*
 *  Quadratic Formula
 *  This program implements the quadratic formula as a override operation and gives the determined equations as a binomial expression in the form of ax^2 + bx + c
 *  CS160-3
 *  September 14, 2023
 *  @author Pedro Damian Sanchez Jr
 */

public class QuadraticFormula {
    private double a;
    private double b;
    private double c;

    public void QuadraticFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "f(x) = " + this.a + "x^2 + " + this.b + "x + " + this.c;
    }

    public double eval(double x) {
        return this.a * x * x + this.b * x + c;
    }
}