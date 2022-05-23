import java.util.*;

public class arraylist_generic {
  public static void main(String args[]) {
    ArrayList<String> list = new ArrayList<String>();// Creating arraylist
    list.add("rohan"); // Adding object in arraylist
    list.add("mohan");
    list.add("sohan");
    list.add("pawan");
    System.out.println("Size of array BEFORE REMOVING " + list.size());

    System.out.println(list.remove("rohan"));
    // Traversing list through Iterator
    Iterator itr = list.iterator();
    System.out.println("Now size of array " + list.size());

    System.out.println("hash code is" + list.hashCode());

    System.out.println("Traversing list through iterator");
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
