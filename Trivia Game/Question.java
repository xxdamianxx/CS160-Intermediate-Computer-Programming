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


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Question {
    private String triviaQuestion;
    private int answerNum;
    private String[] answer;
    private int correctNum;
    
    public Question(){
        triviaQuestion = "";
        answerNum = 0;
        answer = null;
        correctNum = 0;
    }
    
    public Question(String tQ, int aN, String[] a, int cN){
        triviaQuestion = tQ;
        answerNum = aN;
        answer = a;
        correctNum = cN;
    }
    
    public String getTriviaQuestion(){
        return triviaQuestion;
    }
    
    public int getAnswerNumber(){
        return answerNum;
    }
    
    public String[] getAnswer(){
        return answer;
    }
    
    public int correctNum(){
        return correctNum;
    }
    
    public ArrayList<Question> createQuestion(String fileName) throws FileNotFoundException{
        Scanner input = new Scanner(new File(fileName));
        
        String tq;
        int aNum;
        int c;
        ArrayList<Question> question = new ArrayList<Question>();
        while (input.hasNextLine()) {
            tq = input.nextLine();
            aNum = Integer.parseInt(input.nextLine());
            String[] a = new String[aNum];
            for(int i = 0; i < aNum; i++){
                a[i] = input.nextLine();
            }
            c = Integer.parseInt(input.nextLine());
            //System.out.println(tq);
            //System.out.println(aNum);
            //System.out.println(a);
            //System.out.println(c);
            Question q = new Question(tq, aNum, a, c);
            question.add(q);
        }
        input.close();
        return question;
        
    }
    
    
    
    
} 
