import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap_generic {
  public static void main(String[] args) {
    HashMap<Integer,Character> alphabets = new HashMap<>();
    alphabets.put(1, 'A');
    alphabets.put(2, 'B');
    alphabets.put(3, 'C');
    alphabets.put(4, 'D');
    alphabets.put(5, 'E');
    Set<Entry<Integer,Character>> alphabets_entry = alphabets.entrySet();
    Iterator<Entry<Integer,Character>> itr = alphabets_entry.iterator();

    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
