/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.*;

/**
 *
 * @author drewhoang
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void spin(ArrayList<String> slotMachine){
       String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
       int count = 0;
       while(count < 3){
           Random slot = new Random();
           int slotNumber = slot.nextInt(6);
           slotMachine.add(words[slotNumber]);
           count+=1;
       }
       System.out.println("After spin: " + slotMachine.get(0) + " " + slotMachine.get(1) + " " + slotMachine.get(2));
    }
    
    public static double winnings(ArrayList<String> slotMachine, int quarterNo){
        String fruit1 = slotMachine.get(0);
        String fruit2 = slotMachine.get(1);
        String fruit3 = slotMachine.get(2);
        int wins;
        
        if(fruit1.equals("Bars") && fruit2.equals("Bars") && fruit3.equals("Bars")){
            return quarterNo * 0.25 * 5;
        }
        else if(fruit1.equals(fruit2) && fruit1.equals(fruit3) && fruit2.endsWith(fruit3) ){
            return quarterNo * 0.25 * 3;
        }
        else if((fruit1.equals(fruit2) && fruit3.equals(fruit3)) || (fruit1.equals(fruit3) && fruit2.endsWith(fruit2)) || (fruit1.equals(fruit1) && fruit2.equals(fruit3)) ){
            return quarterNo * 0.25 * 2;
        }
        else{
            return 0.00;
        }
        
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        double total = 5.00;
        int quartersNo;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of quarters inserted: ");
        quartersNo = input.nextInt();
        
        while (total > 0 && quartersNo != 0){
            
           
            ArrayList<String> slotMachine = new ArrayList<String>();
            spin(slotMachine);
            System.out.print("You win: $" + String.format("%.2f", winnings(slotMachine,quartersNo)) + "\t");
            total -= (quartersNo*0.25);
            total += winnings(slotMachine,quartersNo);
            System.out.println("Your balance: $" + String.format("%.2f", total));
            if(total == 0){
                break;
            }
            
            System.out.print("Enter number of quarters inserted: ");
            quartersNo = input.nextInt();
                
            if(quartersNo == 0 ){
                break;
            }
           
        }
        System.out.println("Thank you");
        
        
    }
    
}
