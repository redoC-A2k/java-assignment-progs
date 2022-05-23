import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list_generic_foreach {
  public static void main(String[] args) {
    List<Integer> l1 = new ArrayList<Integer>();
    l1.add(81);
    l1.add(12);
    List<Integer> l2 = new ArrayList<Integer>();
    l2.add(3);
    l2.add(6);
    l2.add(72);
    System.out.println("adding list l2 from 1 index " + l1.addAll(1, l2));
    System.out.println(l1);
    System.out.println("Removes element at index 1 :-" + l1.remove(1));
    System.out.println(l1);
    for (Integer i : l1 ) {  
      System.out.println(i);
    }
  }
}
