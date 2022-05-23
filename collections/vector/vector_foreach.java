import java.util.*;

public class vector_foreach {
  public static void main(String args[]) {
    // initial capacity=4
    Vector obj = new Vector(4);

    obj.add(2);
    obj.add("ramesh");
    obj.add("suresh");
    obj.add("mahesh");
    obj.add("kamlesh");
    obj.add(1);
    // Check size and capacity
    System.out.println("Size is: " + obj.size());
    System.out.println("Default capacity is: " + obj.capacity());

    obj.addElement("mohan");
    obj.addElement("sohan");
    obj.addElement("rohan");

    System.out.println("Size after insertion of more element: " + obj.size());
    System.out.println("Capacity after insertion is: " + obj.capacity());

    System.out.println("Elements are: " + obj);
    // Checking if student is present or not in this vector
    if (obj.contains("ramesh")) {
      System.out.println("ramesh is present at the index " + obj.indexOf("ramesh"));
    } else {
      System.out.println("ramesh is not present in the list.");
    }
    // Get the first element
    System.out.println("The first student of the vector list is = " + obj.firstElement());
    // Get the last element
    System.out.println("The last student of the vector list is = " + obj.lastElement());

    for (Object i : obj) {
      System.out.println(i);
    }
  }
}
