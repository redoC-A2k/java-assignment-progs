import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list_generic {
  public static void main(String[] args) {
    List<Integer> l1 = new ArrayList<Integer>();
    l1.add(81);
    l1.add(12);
    List<Integer> l2 = new ArrayList<Integer>();
    l2.add(3);
    l2.add(6);
    l2.add(30);
    System.out.println("adding list l2 from 1 index " + l1.addAll(1, l2));
    System.out.println(l1);
    System.out.println("Removes element at index 1 :-" + l1.remove(1));
    System.out.println(l1);
    l1.set(0, 5);
    Iterator<Integer> itr = l1.iterator();
    while ( itr.hasNext() ) {
      System.out.println(itr.next());
    }
  }
}
