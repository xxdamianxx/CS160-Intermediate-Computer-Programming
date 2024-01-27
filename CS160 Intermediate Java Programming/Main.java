import sorting.Sorting;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = randArray(1000000, Integer.MIN_VALUE, Integer.MAX_VALUE);
        Integer[] arr2 = randArray(1000000, Integer.MIN_VALUE, Integer.MAX_VALUE);
        Integer[] arr3 = randArray(1000000, Integer.MIN_VALUE, Integer.MAX_VALUE);

        long t1 = System.nanoTime();
        Sorting.quickSort(arr1, 0, arr2.length - 1);
        long t2 = System.nanoTime();
        Sorting.mergeSort(arr2);
        long t3 = System.nanoTime();
        Sorting.heapSort(arr3);
        long t4 = System.nanoTime();

        System.out.println("Quick sort: " + (t2 - t1) / 1e6);
        System.out.println("Merge sort: " + (t3 - t2) / 1e6);
        System.out.println("Heap sort: " + (t4 - t3) / 1e6);
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