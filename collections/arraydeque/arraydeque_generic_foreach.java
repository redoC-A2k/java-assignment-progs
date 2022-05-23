import java.util.*;

public class arraydeque_generic_foreach {
  public static void main(String[] args) {
    ArrayDeque<String> obj = new ArrayDeque<String>();
    obj.add("rohan");
    obj.add("mohan");
    obj.add("sohan");
    // Traversing elements

    System.out.println("Traversing through the for each loop");
    for (String str : obj) {
      System.out.println(str);
    }
  }
}
