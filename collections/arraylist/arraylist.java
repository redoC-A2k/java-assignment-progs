import java.util.*;

public class arraylist {
  public static void main(String args[]) {
    ArrayList list = new ArrayList();

    list.add("rohan");
    list.add("mohan");
    list.add("sohan");
    list.add(20);

    // Traversing list through Iterator
    System.out.println("Traversing list through Iterator");
    Iterator itr = list.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }

}
