import java.util.*;
public class arraylist_foreach {
  public static void main(String args[]) {
    ArrayList list = new ArrayList();

    list.add("rohan");
    list.add("mohan");
    list.add("sohan");
    list.add(20);

    System.out.println("Travering list through foreach loop");
    // Travering list through foreach loop
    for (Object str : list)
      System.out.println(str);
    System.out.println("The clone of list is " + list.clone());
    System.out.println("is this list empty T/F :- " + list.isEmpty());
    System.out.println("The size of the list is " + list.size());
  }

}
