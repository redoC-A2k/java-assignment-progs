import java.util.*;

public class vector_generic_foreach {

  public static void main(String[] args) {
    Vector<Integer> obj = new Vector<Integer>();
    obj.add(5);
    obj.add(6);
    obj.add(7);
    obj.add(1, 45);// in 1st place 45 is inserted
    System.out.println("The capacity of vector list is " + obj.capacity());
    for (Integer in : obj) {
      System.out.println(in);
    }
    obj.clear();
    System.out.println("now the list is cleared " + obj);
  }
}
