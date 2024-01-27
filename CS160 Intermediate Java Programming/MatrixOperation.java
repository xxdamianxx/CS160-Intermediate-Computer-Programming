/*
 *  Recursive Sum
 *  This program takes a symmetric metric and transposes it
 *  CS160-3
 *  September 7, 2023
 *  @author Pedro Damian Sanchez Jr
 */

 public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shift(arr);

        int[][] A = {
                {1, 2, 7},
                {2, 5, 6},
                {7, 6, 10},
        };
    }

    // Tests if a metric is symmetrical
    public static boolean isSymmetric(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] != A[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Tests if a metric is skewed symmetrical
    public static boolean isSkewSymmetric(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] != -
                        A[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void reverseCopy(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1];
        }
    }

    public static void shift(int[] arr) {
        int firstEl = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstEl;
    }

    public static void printArray(int[] arr) {
        for (int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
    public static void printArray2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}