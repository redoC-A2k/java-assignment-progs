import java.util.NavigableSet;
import java.util.TreeSet;

public class navigableset_generic_foreach {
  public static void main(String[] args) {
    NavigableSet<Integer> ns = new TreeSet<>();
    ns.add(1);
    ns.add(5);
    ns.add(2);
    ns.add(3);
    ns.add(4);

    for (Integer i : ns) {
      System.out.println(i);
    }
  }
}
