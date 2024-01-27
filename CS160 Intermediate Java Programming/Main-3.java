import data_structures.BST;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = randArray(10, -100, 100);
        BST<Integer> bst = new BST<>();
        for (int num: arr) {
            bst.add(num);
        }
        printArray(arr);
        bst.printInorder();
        System.out.println(bst.contains(arr[5]));
        bst.remove(arr[5]);
        bst.printInorder();
        System.out.println(bst.contains(arr[5]));
    }

    public static Integer[] randArray(int n, int low, int high) {
        Integer[] arr = new Integer[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(low, high);
        }
        return arr;
    }

    public static<T> void printArray(T[] arr) {
        for (T el: arr) System.out.print(el + " ");
        System.out.println();
    }
}