import java.util.LinkedList;
import java.util.Deque;
import java.util.Iterator;
import java.util.ArrayDeque;

public class deque_generic {
  public static void main(String[] args) {
    Deque<String> obj = new ArrayDeque<String>();
    obj.add("Rohan");
    obj.add("Mohan");
    obj.add("Rohan");
    obj.add("Ajay");
    obj.add("Mohan");

    System.out.println(obj);
    System.out.println("elements contain Rohan ? " + obj.contains("Rohan"));
    System.out.println("removing last Mohan" + obj.removeLastOccurrence("Mohan"));
    System.out.println(obj);
    System.out.println("after removing Rohan");
    obj.removeFirstOccurrence("Rohan");
    System.out.println(obj);
    obj.addFirst("first element");
    obj.addLast("last element");

    System.out.println("Traversing elements through iterator");
    Iterator itr = obj.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
