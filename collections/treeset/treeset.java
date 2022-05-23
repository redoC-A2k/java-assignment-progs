import java.util.Iterator;
import java.util.TreeSet;

public class treeset {
  public static void main(String[] args) {
    TreeSet ts = new TreeSet();
    ts.add(1);
    ts.add(5);
    ts.add(2);
    ts.add(3);
    ts.add(5);
    ts.add(4);
    ts.add(3);
    Iterator itr = ts.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
