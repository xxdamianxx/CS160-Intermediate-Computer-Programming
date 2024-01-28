/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author drewhoang
 */


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;




public class Assignment3 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Question q = new Question();
        ArrayList<Question> question = new ArrayList<Question>();
        question = q.createQuestion("trivia.txt");
        String letterchoice = "ABCD";
        int player1Points = 0;
        int player2Points = 0;
        int questionPlayer1 = 1;
        int questionPlayer2 = 1;
        for(int i = 0; i < 10; i++){
            
            if(i%2 == 0){
                
                System.out.print("Question #" + questionPlayer1  + " for " );
                System.out.print("Player #1\n");
                questionPlayer1++;
            }
            else{
                System.out.print("Question #" + questionPlayer2  + " for " );
                System.out.print("Player #2\n");
                questionPlayer2++;
            }
            System.out.println(question.get(i).getTriviaQuestion());
            
            for(int j = 0; j < question.get(i).getAnswerNumber(); j++)
            {
                
                System.out.println(letterchoice.charAt(j) + ") " + question.get(i).getAnswer()[j]);
            }
            System.out.print("Your best guess: ");
            String choice  = input.next();
            char bestAnswer = choice.toUpperCase().charAt(0);
            if(bestAnswer == letterchoice.charAt(question.get(i).correctNum()-1) ){
                System.out.println("That is correct!");
                if(i%2 == 0){
                   player1Points++;
                }
                else{
                   player2Points++;
                }
                
            }
            else{
                 System.out.println("That is wrong. The correct answer is " + question.get(i).getAnswer()[question.get(i).correctNum()-1]);
            }
        }
        if (player1Points == player2Points){
            System.out.println("Tie Game");
        }
        else if (player1Points > player2Points  ){
            System.out.println("Player #1 wins with " + player1Points + " points");
        }
        else{
            System.out.println("Player #2 wins with" + player2Points + " points");
        }
        
    }
    
}
