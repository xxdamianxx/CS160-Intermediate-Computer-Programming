import java.util.ArrayList;
import java.util.Arrays;       // Helpful for sorting
import java.util.Collections;  // Helpful for sorting
import java.util.HashSet;      // Helpful for keeping only unique items in a collection
import java.util.Random;
import java.util.Vector;

public class GenMethods {

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        HashSet<E> hashSet = new HashSet<>(list);
        ArrayList<E> newList = new ArrayList<E>(hashSet);
        return newList;
    }

    public static <E> String randomize(Vector<E> list, long seed) {
        Random rand = new Random(seed);
        int x = 0;
        int y = 0;
        for (int i = 0; i < 30; i++) {
            x = rand.nextInt(list.size());
            y = rand.nextInt(list.size());
            E temp = list.get(y);
            list.set(y, list.get(x));
            list.set(x, temp);
        }
        return list.toString();
    }

    public static <E extends Comparable<E>> E secondMin(ArrayList<E> list) {
        ArrayList<E> newList = removeDuplicates(list);//newList unique
        E min = newList.get(0);
        int indexMin = 0;
        for (int i = 0; i < newList.size(); i++) {//find min of newList
            if (min.compareTo(newList.get(i)) > 0) {
                min = newList.get(i);
                indexMin = i;
            }
        }
        newList.remove(indexMin);//remove min at indexMin
        min = newList.get(0);
        for (int i = 0; i < newList.size(); i++) {//new min is 2nd min
            if (min.compareTo(newList.get(i)) > 0) {
                min = newList.get(i);
            }
        }
        return min;
    }

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int l = 0;
        int r = list.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (list[mid].compareTo(key) == 0) {
                return mid;
            } else if (list[mid].compareTo(key) < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static <E extends Comparable<E>> E secondMin(E[] list) {
        ArrayList<E> temp = new ArrayList<>();
        Collections.addAll(temp, list);
        return secondMin(temp);
    }

    public static <E extends Comparable<E>> E min(E[][] list) {
        E min = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (min.compareTo(list[i][j]) > 0) {
                    min = list[i][j];
                }
            }
        }
        return min;
    }
}