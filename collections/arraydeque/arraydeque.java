import java.util.*;

public class arraydeque {
  public static void main(String[] args) {
    ArrayDeque obj = new ArrayDeque ();
    obj.add("rohan");
    obj.add("mohan");
    obj.add("sohan");
    obj.add(29);

    // Traversing elements
    System.out.println("Traversing through the iterator");
    Iterator itr = obj.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
