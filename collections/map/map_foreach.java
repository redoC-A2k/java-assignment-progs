import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map_foreach {
  public static void main(String[] args) {
    Map alphabets = new HashMap();
    alphabets.put(1, 'A');
    alphabets.put(2, 'B');
    alphabets.put(3, 'C');
    alphabets.put(4, 'D');
    alphabets.put(5, 'E');
    alphabets.put('A', "vowels");
    alphabets.put('E', "vowels");
    alphabets.put('I', "vowels");
    Set alphabets_entry = alphabets.entrySet();
    for (Object o : alphabets_entry) {          
      System.out.println(o); 
    }
  }
}
