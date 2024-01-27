/*
 *  Counting Pennies + Flowchart Development
 *  This program calculates the total amount, in dollars and cents, of coins inserted by the user
 *  CS160-3
 *  September 5, 2023
 *  @author Pedro Damian Sanchez Jr
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quarters = scan.nextInt();
        int dimes = scan.nextInt();
        int nickels = scan.nextInt();
        int pennies = scan.nextInt();

        int total = (quarters * 25) + (dimes * 10) + (nickels * 5) + pennies;
        int dollars = total / 100;
        int cents = total % 100;

        System.out.println(dollars + " dollars and " + cents + " cents");
    }
}