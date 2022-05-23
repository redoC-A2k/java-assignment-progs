import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class hashtable_generic_foreach {
  public static void main(String[] args) {
    Hashtable<Integer,String> studentsList = new Hashtable<>();
    studentsList.put(1,"afshan");
    studentsList.put(2,"rahul");
    studentsList.put(3,"vinayak");
    studentsList.put(4, "xersez");
    Set set = studentsList.entrySet();
    for (Object o : set) {
      System.out.println(o); 
    }
  }
}
