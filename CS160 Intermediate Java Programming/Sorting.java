package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public final class Sorting {

    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[smallestIndex]) < 0) {
                    smallestIndex = j;
                }
            }
            swap(arr, i, smallestIndex);
        }
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(value) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
        }
    }

    public static <T extends Comparable<T>> int partition(T[] arr, int low, int high) {
        int pivotIndex = (low + high) / 2;
        T pivot = arr[pivotIndex];

        while (low < high) {
            while (arr[low].compareTo(pivot) < 0) {
                low++;
            }
            while (arr[high].compareTo(pivot) > 0) {
                high--;
            }
            if (low < high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }

        return high;
    }

    public static <T extends Comparable<T>> void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int index = partition(arr, low, high);
            quickSort(arr, low, index);
            quickSort(arr, index + 1, high);
        }
    }


    public static <T extends Comparable<T>> T[] merge(T[] arr1, T[] arr2) {
        T[] merged = (T[]) Array.newInstance(arr1[0].getClass(), arr1.length + arr2.length);
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i].compareTo(arr2[j]) < 0) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }

    public static <T extends Comparable<T>> T[] mergeSort(T[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int middle = arr.length / 2;
        T[] left = Arrays.copyOfRange(arr, 0, middle);
        T[] right = Arrays.copyOfRange(arr, middle, arr.length);

        T[] leftSorted = mergeSort(left);
        T[] rightSorted = mergeSort(right);

        return merge(leftSorted, rightSorted);
    }

    public static <T extends Comparable<T>> void heapSort(T[] arr) {
        PriorityQueue<T> queue = new PriorityQueue<>(Arrays.asList(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = queue.poll();
        }
    }
}
