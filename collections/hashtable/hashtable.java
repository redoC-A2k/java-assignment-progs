import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class hashtable {
  public static void main(String[] args) {
    Hashtable studentsList = new Hashtable();
    studentsList.put(1,"afshan");
    studentsList.put(2,"rahul");
    studentsList.put(3,"vinayak");
    studentsList.put(4, "xersez");
    studentsList.put("Nil", "Transfer certificate given");
    studentsList.put(6, "zeus");
    Set entryset = studentsList.entrySet();
    Iterator itr = entryset.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
