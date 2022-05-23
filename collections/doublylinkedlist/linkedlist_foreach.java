import java.util.*;

public class linkedlist_foreach {
  public static void main(String args[]) {
    LinkedList<String> a1 = new LinkedList<String>();
    a1.add("mohan");
    a1.add("bhagat");
    a1.add("singh");
    a1.addFirst("Mr");
    a1.addLast("S/O of prathmesh bhagat singh");
    a1.addFirst("Coder");

    System.out.println("Traversing list through foreach loop");
    for (String str : a1) {
      System.out.println(str);
    }
  }
}
