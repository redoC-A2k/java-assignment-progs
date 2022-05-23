import java.util.NavigableSet;
import java.util.TreeSet;

public class treeset_foreach {
  public static void main(String[] args) {
    TreeSet ts = new TreeSet<>();
    ts.add(1);
    ts.add(5);
    ts.add(2);
    ts.add(3);
    ts.add(1);
    ts.add(4);
    ts.add(2);
    for (Object o : ts) {
      System.out.println(o);
    }
  }
}
