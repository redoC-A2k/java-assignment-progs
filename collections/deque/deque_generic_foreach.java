import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class deque_generic_foreach {
  public static void main(String[] args) {
    Deque<Integer> deq = new ArrayDeque<>();
    deq.offer(5);
    deq.offer(6);
    deq.add(7);
    deq.offerFirst(1);

    for (int i : deq) {
      System.out.println(i);
    }

    deq.poll();
    System.out.println("after using poll " + deq);
    deq.pollFirst();
    System.out.println("after using poll first " + deq);
    deq.pollLast();
    System.out.println("after using polllast " + deq);
  }
}
