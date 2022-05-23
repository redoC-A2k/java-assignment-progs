import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue_generic {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < 5; i++)
      q.add(i);
    int removedel = q.remove();
    System.out.println("removed element-"
        + removedel);
    int head = q.peek();
    System.out.println("head of queue-"
        + head);
    int size = q.size();
    System.out.println("Size of queue-"
        + size);
    Iterator itr = q.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
