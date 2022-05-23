import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
  public static void main(String[] args) {
    Queue obj = new LinkedList();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i <= 5; i++) {
      System.out.print("Enter elements of queue ");
      obj.add(sc.next());
    }

    System.out.println("Enter any integer element you want to remove");
    Object a = sc.next();
    obj.remove(a);
    System.out.println("Enter any String element you want to remove");
    String b = sc.next();
    obj.remove(b);
    System.out.println("Printing through foreach loop");

    Iterator itr = obj.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
