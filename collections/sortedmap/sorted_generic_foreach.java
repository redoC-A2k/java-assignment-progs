import java.util.SortedMap;
import java.util.Iterator;
import java.util.TreeMap;

public class sorted_generic_foreach {
  public static void main(String[] args){
    SortedMap<Integer,String> students = new TreeMap<Integer,String>();
    students.put(4,"Tanishq");
    students.put(3, "Rohan");
    students.put(1, "Arnab");
    students.put(2, "bhim");
    for (Integer i : students.keySet()) {
      System.out.println(i);
    }

    for (String s : students.values()) {
      System.out.println(s);
    }
  }
}
