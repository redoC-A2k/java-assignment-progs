import java.util.*;

public class linkedlist_generic_foreach {
  public static void main(String[] args) {
    LinkedList obj = new LinkedList<>();
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter a number- ");
    int a = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      obj.add(i * a);
    }
    System.out.println("traversing with foreach loop");
    for (Object in : obj) {
      System.out.println(in);
    }
    sc.close();
  }
}
