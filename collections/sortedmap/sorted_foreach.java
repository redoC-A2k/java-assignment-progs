import java.util.SortedMap;
import java.util.TreeMap;

public class sorted_foreach {
  public static void main(String[] args){
    SortedMap students = new TreeMap();
    students.put(4,"Tanishq");
    students.put(3, "Rohan");
    students.put(1, "Arnab");
    students.put(2, "bhim");
    for (Object o : students.keySet()) {
      System.out.println(o);
    }

    for (Object o : students.values()) {
      System.out.println(o);
    }
  }
}
