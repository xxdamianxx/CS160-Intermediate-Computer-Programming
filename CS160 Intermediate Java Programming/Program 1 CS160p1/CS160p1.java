/*
 *  CS160 Program 1
 *  This program builds a 2-D array of numbers defined by the the user and displays its matrix and transposition
 *  CS160-3
 *  September 8, 2023
 *  @author Pedro Damian Sanchez Jr
 */

public class CS160p1 {
    private int[][] arr;

    // A constructor that builds a 2-D array of rows and columns
    public CS160p1(int numRows, int numCols) {
        arr = createPatterned2DArray(numRows, numCols);
    }

    public int getRows() {
        return arr.length;
    }

    public int getCols() {
        return arr[0].length;
    }

    // Creates a geometric array of integers
    private int[][] createPatterned2DArray(int numRows, int numCols) {
        int[][] arr = new int[numRows][numCols];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = 10 + ((i + 1) * numRows) + j;
            }
        }
        return arr;
    }

    // Prints 2-D array of intgers
    public void print2DArray() {
        this.print2DArray(arr);
    }

    public void print2DArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; ++j) {
                System.out.printf("%-4d", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Prints transposed 2-D array of intgers
    public void print2DArrayTransposed(int[][] a, int numRows, int numCols) {
        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; ++j) {
                System.out.printf("%-4d", a[j][i]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void print2DArrayTransposed() {
        this.print2DArrayTransposed(arr, this.getRows(), this.getCols());
    }
}