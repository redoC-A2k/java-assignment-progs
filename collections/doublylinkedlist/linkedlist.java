import java.util.*;

public class linkedlist {
  public static void main(String[] args) {
    LinkedList obj = new LinkedList();

    obj.add("mohan");
    obj.add("bhagat");
    obj.add("singh");
    obj.add(5);

    obj.remove("4.5");
    obj.remove(1);
    obj.addFirst('M');

    System.out.println("list " + obj);

    obj.removeFirst();
    System.out.println("list after removing first element " + obj);
    obj.removeLast();
    System.out.println("list after the last element " + obj);
    System.out.println("index of orange is " + obj.indexOf("orange"));

    Iterator itr = obj.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
