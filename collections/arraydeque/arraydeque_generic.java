import java.util.*;

public class arraydeque_generic {
  public static void main(String[] args) {
    ArrayDeque<String> obj = new ArrayDeque<String>();
    obj.add("rohan");
    obj.add("mohan");
    obj.add("sohan");
    // Traversing elements
    System.out.println("Traversing through the iterator");
    Iterator<String> itr = obj.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
