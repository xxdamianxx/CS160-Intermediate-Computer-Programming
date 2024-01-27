import java.util.Scanner;

public class RollPair {
    public static int rollingForPair(GVDie d1, GVDie d2, int val){

        /* Type your code here. */
        int rolls = 0;

        do {
            d1.roll(); // Roll the first die
            d2.roll(); // Roll the second die
            rolls++;   // Increment the number of rolls

            // Check if both dice have the desired value
        } while (d1.getValue() != val || d2.getValue() != val);

        return rolls;

    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        GVDie d1 = new GVDie(); // Create a GVDie object
        GVDie d2 = new GVDie(); // Create a GVDie object
        d1.setSeed(15);   // Set the GVDie object with seed value 15
        d2.setSeed(15);   // Set the GVDie object with seed value 15
        int rolls;
        int val;

        val = scnr.nextInt();
        rolls = rollingForPair(d1, d2, val);
        System.out.println("It took " + rolls + " rolls to get a pair of " + val + "'s.");
    }
}
