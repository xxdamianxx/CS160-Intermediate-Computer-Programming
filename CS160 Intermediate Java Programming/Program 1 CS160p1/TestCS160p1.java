/*
 *  CS160 Program 1
 *  This program builds a 2-D array of numbers defined by the the user and displays its matrix and transposition
 *  CS160-3
 *  September 8, 2023
 *  @author Pedro Damian Sanchez Jr
 */

import java.util.Scanner;

public class TestCS160p1 {
    public static void main(String[] args) {

        // Takes user input to format 2-D array
        Scanner scan = new Scanner(System.in);
        int numRows = scan.nextInt();
        int numCols = scan.nextInt();

        // Prints the dimensions of the matrix decalred
        System.out.println(numRows + " by " + numCols + " matrix");
        System.out.println();

        // Calls the class methods in CS160p1.java
        CS160p1 t = new CS160p1(numRows, numCols);
        t.print2DArray();
        t.print2DArrayTransposed();
    }
}