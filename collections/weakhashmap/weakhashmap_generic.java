import java.util.WeakHashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;

public class weakhashmap_generic {
  public static void main(String[] args) {
    WeakHashMap<Integer,String> students = new WeakHashMap<>();
    students.put(1, "arnav");
    students.put(2, "bhim");
    students.put(3, "chetan");

    Set<Entry<Integer,String>> students_entry = students.entrySet();
    Iterator<Entry<Integer,String>> itr = students_entry.iterator();

    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
