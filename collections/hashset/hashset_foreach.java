import java.util.*;

public class hashset_foreach {
  public static void main(String[] args) {
    HashSet obj = new HashSet();
    obj.add("rohan");
    obj.add("sohan");
    obj.add("mohan");
    obj.add("konan");
    obj.add(1);
    obj.add(2.8);
    for (Object o : obj) {
      System.out.println(o);
    }
  }
}
