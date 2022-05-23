import java.util.NavigableSet;
import java.util.Iterator;
import java.util.TreeSet;

public class navigableset_generic {
  public static void main(String[] args) {
    NavigableSet<Integer> ns = new TreeSet<>();
    ns.add(1);
    ns.add(5);
    ns.add(2);
    ns.add(3);
    ns.add(4);

    NavigableSet<Integer> reversens = ns.descendingSet();
    Iterator<Integer> itr = reversens.iterator();

    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
