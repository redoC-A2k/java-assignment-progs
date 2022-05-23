import java.util.Hashtable;
import java.util.Set;

public class hashtable_foreach {
  public static void main(String[] args) {
    Hashtable studentsList = new Hashtable();
    studentsList.put(1,"afshan");
    studentsList.put(2,"rahul");
    studentsList.put(3,"vinayak");
    studentsList.put(4, "xersez");
    studentsList.put("Nil", "Transfer certificate given");
    studentsList.put(6, "zeus");
    Set set = studentsList.entrySet();
    for (Object o : set) {
      System.out.println(o); 
    }
  }
}
