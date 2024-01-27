import java.util.Scanner;

public class RollX {
   public static int rollSpecificNumber(GVDie die, int num, int goal) {
      
      /* Type your code here. */
      int rolls = 0;
      int count = 0;

      do {
         die.roll(); // Roll the die
         rolls++;   // Increment the number of rolls

         // Check if the rolled number is equal to the specified number
         if (die.getValue() == num) {
            count++; // Increment the count of the specified number
         }

      } while (count < goal);

      return rolls;
      
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      GVDie die = new GVDie();   // Create a GVDie object
      die.setSeed(15);   // Set the GVDie object with seed value 15
      int num;
      int goal;
      int rolls;
      
      num = scnr.nextInt();
      goal = scnr.nextInt();
      rolls = rollSpecificNumber(die, num, goal);   // Call rollSpecificNumber() and return number of rolls.
      System.out.println("It took " + rolls + " rolls to get a \"" + num + "\" " + goal + " times.");
   }
}
