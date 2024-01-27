package data_structures;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
   private static Comparable<Object>[] array;

    public static void main(String[] args) {
       Integer[] nums = {10, 4, 8, -5, 8, -1, 0};
       Character[] chars = {'Z', 'a', 'z', 'a', 'M', 'a', 'n', 'a', 'g', 'a', 'd', 'z', 'e'};
       String[] strings = {"SDSU", "CS 160", "Section 1002"};
       Point[] points = {new Point(3, 2), new Point(2, -1), new Point(3, 4), new Point(2, 2)};
       List<Point> pointsList = Arrays.asList(points);
       Collections.sort(pointsList, new PointsComparator());


       Arrays.sort(nums);
       Arrays.sort(chars);
       Arrays.sort(strings);
       Arrays.sort(points);

       printArray(nums);
       printArray(chars);
       printArray(strings);
       printArray(points);


       Point p0 = points[0];
       p0.compareTo(points[1]);
}
        public static <T extends Comparable<T>>int checkOrder(T[]array){
            boolean isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(array[i - 1]) < 0) {
                    isSorted = false;
                    break;
                }
            }
            if (isSorted) {
                return -1;
            }

            boolean isReverseSorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(array[i - 1]) > 0) {
                    isReverseSorted = false;
                    break;
                }
            }
            if (isReverseSorted) {
                return 1;
            }
            return 0;

            public static <T > void printArray (T[]array){
                for (T el : array) {
                    System.out.print(el + " ");
                }
                System.out.println();
            }
        }
    }