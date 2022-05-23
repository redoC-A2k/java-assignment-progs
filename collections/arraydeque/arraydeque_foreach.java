import java.util.*;

public class arraydeque_foreach {
  public static void main(String[] args) {
    ArrayDeque obj = new ArrayDeque();
    obj.add("rohan");
    obj.add("mohan");
    obj.add("sohan");
    obj.add(34);

    // Traversing elements
    System.out.println("Traversing through the for each loop");
    for (Object o : obj) {
      System.out.println(o);
    }
  }
}
