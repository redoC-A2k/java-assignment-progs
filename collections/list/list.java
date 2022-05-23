import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list {
  public static void main(String[] args) {
    List obj = new ArrayList();
    obj.add("MTECH");
    obj.add("MCA");
    obj.add("BCA");
    obj.add("MBA");
    obj.add(9920);
    obj.add(12089);

    Iterator itr = obj.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
