import java.util.*;

public class hashset_generic {
  public static void main(String[] args) {
    HashSet<String> obj = new HashSet<>();
    obj.add("rohan");
    obj.add("sohan");
    obj.add("mohan");
    obj.add("konan");
    Iterator<String> itr = obj.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
