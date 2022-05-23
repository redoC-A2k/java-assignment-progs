import java.util.SortedMap;
import java.util.Iterator;
import java.util.TreeMap;

public class sortedmap {
  public static void main(String[] args){
    SortedMap students = new TreeMap();
    students.put(4,"Tanishq");
    students.put(3, "Rohan");
    students.put(1, "Arnab");
    students.put(2, "bhim");

    Iterator itr = students.entrySet().iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
