import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist_generic {
  public static void main(String args[]) {
    LinkedList<String> a1 = new LinkedList<String>();
    a1.add("mohan");
    a1.add("bhagat");
    a1.add("singh");
    a1.addFirst("Mr");
    a1.addLast("S/O of prathmesh bhagat singh");

    Iterator<String> itr = a1.iterator();
    System.out.println("Traversing list through iterator");
    while (itr.hasNext()) {
      System.out.print(itr.next());
    }
    System.out.println("\n");
  }
}
