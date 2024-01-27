import java.util.LinkedList;
import java.util.Deque;

public class Numbers {
   public static void main (String[] args) {
      Deque<Integer> nums = new LinkedList<Integer>();
      int dequeSize;

      nums.addFirst(55);
      nums.addLast(57);
      nums.addFirst(74);

      System.out.println(nums.pollLast());
      System.out.println(nums.pollFirst());
      System.out.println(nums.pollFirst());
  }
}