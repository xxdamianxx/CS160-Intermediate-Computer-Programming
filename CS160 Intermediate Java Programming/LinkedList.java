/*
 *  Linked List
 *  This program calls the Java Linked List package installs three values into a vector array
 *  CS160-3
 *  September 19, 2023
 *  @author Pedro Damian Sanchez Jr
 */

import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printArrayList(list);

        Scanner scan = new Scanner(System.in);

        while (true) {
            int num = scan.nextInt();
            if (num == -1) {
                break;
            }

            int i = 0;
            while (i < list.size() && list.get(i) < num) {
                i++;
            }

            list.add(i, num);
        }
        printArrayList(list);
    }

    public static void printArrayList(LinkedList<Integer> list) {
        for (int el: list) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}