import java.util.LinkedList;
import java.util.Queue;

public class queue_generic_foreach {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < 5; i++)
      q.add(i);
    int removedel = q.poll();
    System.out.println("removed element-"
        + removedel);
    int head = q.peek();
    System.out.println("head of queue-"
        + head);
    int size = q.size();
    System.out.println("Size of queue-"
        + size);
    for (Integer i : q) {
      System.out.println(i);
    }
  }
}
