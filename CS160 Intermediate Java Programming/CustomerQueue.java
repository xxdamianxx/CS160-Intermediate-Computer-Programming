import java.util.Queue;
import java.util.LinkedList;

public class CustomerQueue {
   public static void main(String[] args) {
      Queue<String> customers = new LinkedList<String>();

      customers.add("Ava");
      customers.add("Noa");
      customers.add("Jon");
      customers.add("Ben");
  
      customers.remove();
      System.out.println(customers.peek());
      System.out.println(customers.element());
      System.out.println(customers.poll());
   }
}