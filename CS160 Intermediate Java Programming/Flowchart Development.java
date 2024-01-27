/*
 *  Counting Pennies + Flowchart Development
 *  This program takes 3 numbers from the user and displays the largest one
 *  CS160-3
 *  September 5, 2023
 *  @author Pedro Damian Sanchez Jr
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("Enter the first number: ");
        double number1 = scan.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scan.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = scan.nextDouble();

        // Find and output the largest number
        double largestNumber = findLargest(number1, number2, number3);
        System.out.println("The largest number is: " + largestNumber);
    }
    
	// Method to find the largest number among three numbers
	public static double findLargest(double num1, double num2, double num3) {
            double largest = num1;

            if (num2 > largest) {
                largest = num2;
            }

            if (num3 > largest) {
                largest = num3;
            }
            return largest;
        }
    }