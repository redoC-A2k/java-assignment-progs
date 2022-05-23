import java.util.NavigableSet;
import java.util.Iterator;
import java.util.TreeSet;

public class navigableset {
  public static void main(String[] args) {
    NavigableSet ns = new TreeSet();
    ns.add(1);
    ns.add(5);
    ns.add(2);
    ns.add(3);
    ns.add(4);

    Iterator itr = ns.iterator();

    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
