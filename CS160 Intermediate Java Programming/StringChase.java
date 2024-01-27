/*
 *  String Chase
 *  This program takes an array of strings and targets all strings with a specific character
 *  CS160-3
 *  August 31, 2023
 *  @author Pedro Damian Sanchez Jr
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String str = "Hello";
//        System.out.println(str.indexOf("l"));
        String[] str = {"hello", "zoo", "sleep", "drizzle"};
        char target = 'z';
        stringChase(str, target);
    }
    
    public static void stringChase(String[] str, char target) {
        for(String word : str) {
            if(word.indexOf(target) >= 0) {
                System.out.println(word);
            }
        }
    }
}