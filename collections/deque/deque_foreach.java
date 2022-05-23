import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class deque_foreach {
  public static void main(String[] args) {
    Deque obj = new LinkedList();
    for (int i = 0; i <= 5; i++) {
      int a = i * 3;
      obj.add(a);
    }
    obj.add("afshan");

    System.out.println("The queue is: " + obj);
    int num1 = (int)obj.removeFirst();
    System.out.println("The element deleted from the head is: " + num1);
    System.out.println("The queue after deletion is: " + obj);

    int head = (int)obj.peek();
    System.out.println("The head of the queue is: " + head);

    System.out.println("Traversing through foreach");
    for (Object o : obj) {
      System.out.println(o);
    }
  }
}
