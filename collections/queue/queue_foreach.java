import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class queue_foreach {
  public static void main(String[] args) {
    Queue obj = new LinkedList();
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i <= 5; i++) {
      System.out.print("Enter elements of queue ");
      obj.add(sc.next());
    }

    System.out.println("Enter any element you want to remove");
    Object a = sc.next();
    obj.remove(a);
    System.out.println("Enter any other element you want to remove");
    String b = sc.next();
    obj.remove(b);
    for (Object i : obj) {
      System.out.println(i);
    }
  }
}
