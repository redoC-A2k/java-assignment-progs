import java.util.NavigableSet;
import java.util.TreeSet;

public class navigableset_foreach {
  public static void main(String[] args) {
    NavigableSet ns = new TreeSet();
    ns.add(1);
    ns.add(5);
    ns.add(2);
    ns.add(3);
    ns.add(4);
    NavigableSet reversens = ns.descendingSet();
    for (Object i : reversens) {
      System.out.println(i);
    }
  }
}
