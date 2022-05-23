import java.util.Set;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public class weakhashmap_generic_foreach {
  public static void main(String[] args){
    WeakHashMap<String,Integer> vegetables = new WeakHashMap<>();
    vegetables.put("Tomato", 15);
    vegetables.put("Onion", 10);
    vegetables.put("Brinjal", 20);
    vegetables.put("Lady-finger", 25);

    Set<Entry<String,Integer>> vegetables_entry = vegetables.entrySet();

    for (Entry e : vegetables_entry) {
      System.out.println(e);
    }
  }
}

