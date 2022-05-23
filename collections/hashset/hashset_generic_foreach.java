import java.util.*;

public class hashset_generic_foreach {
  public static void main(String[] args) {
    HashSet<String> obj = new HashSet<>();
    obj.add("rohan");
    obj.add("sohan");
    obj.add("mohan");
    obj.add("konan");
    for (String s : obj) {
      System.out.println(s);
    }
  }
}
