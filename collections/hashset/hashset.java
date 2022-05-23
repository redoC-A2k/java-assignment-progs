import java.util.*;

public class hashset {
  public static void main(String[] args) {
    HashSet obj = new HashSet();
    obj.add("rohan");
    obj.add("sohan");
    obj.add("mohan");
    obj.add("konan");
    obj.add(1);
    obj.add(2.8);
    Iterator itr = obj.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
