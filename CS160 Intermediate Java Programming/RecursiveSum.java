/*
 *  Recursive Sum
 *  This program takes an array of integers and produces their sum recursively using two different methods
 *  CS160-3
 *  September 1, 2023
 *  @author Pedro Damian Sanchez Jr
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arraySum(numbers));
        System.out.println(arraySumRecursive(numbers, numbers.length));
    }

	// Method 1
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        return sum;
    }

	// Method 2
    public static int arraySumRecursive(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + arraySumRecursive(arr, n - 1);
    }
}