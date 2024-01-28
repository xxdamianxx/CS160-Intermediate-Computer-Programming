/*
 *
 */

package slotmachine;

import java.util.Scanner;
import java.util.*;
import java.util.concurrent.TimeUnit;

/*
 * by Pedro Damian Sanchez Jr
 */

public class SlotMachine {
    
    public static void slotNumbers(ArrayList<integer> slotMachine)
    {
        int count = 0;
        while (count < 3)
        {
            Random slot = new Random();
            int slotNumber = slot.nextInt(10)+1;
            slotMachine.add(slotNumber);
            count+=1;
        }
    }
    
    public static int winnings(ArrayList<Integer> slotMachine)
    
    {        
        int number1 = slotMachine.get(0);
        int number2 = slotMachine.get(1);
        int number3 = slotMachine.get(2);
        int points;
        
        
        if (number1==7 && number2==7 && number3==7)
        {
            points=750;
            return points;       
        }
        if (number1==number2 && number1==number3 && number2==number3)
        {
            points = 75;
            return points;
        }
        if (number1==number2 || number1==number3 || number2==number3)
        {
            if (number1==7 && number2==7)
            {
                points=20;
                return points;       
            }
        
            else if (number2==7 && number3==7)
            {
                points=20;
                return points;
            }
            else if (number1==7 && number3==7)
            {
                points=20;
                return points;
            }
            
            else if
            {
                points=5;
                return points;
            }
            else
            {
                points=0;
                return points;
            }    
}
    
public static void main(String[] args) throws InterruptedException
{
    int userPoints;
    int points;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter amount of playable points: ");
    userPoints = input.nextInt();
    input.nextLine();
    
    while (userPoints > 0)
    {
        System.out.println("Spin? [Yes/No]");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("Yes"))
        {
            userPoints-=1;
            ArrayList<Integer> slotMachine = new ArrayList<Interger>();
            
            slotNumbers(slotMachine);
            
            points = winnings(slotMachine);
            userPoints += points;
            
            for (int i=0; i<3; i++)
            {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(slotMachine.get(i) + " ");
            }
            
            System.out.println("\nPoints won: " +points);
            System.out.println("Points left:" + userPoints);
        }
        
        else if (answer.equalsIgnoreCase("no"))
        {
            System.out.println("Thanks for playing!");
            System.out.println("Points left: " + userPoints);
            System.out.println("by Damian");
            break;
        }
    }
}
}