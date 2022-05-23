import java.util.*;

public class arraylist_generic_foreach {
  public static void main(String[] args) {
    List<Integer> obj = new ArrayList<Integer>();
    obj.add(152);
    obj.add(343);
    obj.add(139);
    obj.add(123);
    obj.add(358);

    System.out.println("Traversing list through foreach loop");
    for (Integer str : obj) {
      System.out.println(str);
    }
    Collections.sort(obj);
    System.out.println("the assending order is" + obj);
  }
}
