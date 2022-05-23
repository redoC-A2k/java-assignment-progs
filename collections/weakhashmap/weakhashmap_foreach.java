import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;


public class weakhashmap_foreach {
  static void print_weak_hashmap(WeakHashMap hm){
      Set hm_entry = hm.entrySet();
      for (Object o : hm_entry){
        System.out.println(o);
      }
  }

  public static void main(String[] args){
    WeakHashMap alphabets = new WeakHashMap();
    alphabets.put(1, 'A');
    alphabets.put(2, 'B');
    alphabets.put(3, 'C');
    alphabets.put(4, 'D');
    alphabets.put(5, 'E');
    alphabets.put('A', "vowels");
    alphabets.put('E', "vowels");
    alphabets.put('I', "vowels");

    print_weak_hashmap(alphabets);

    alphabets.put(1, null);

    print_weak_hashmap(alphabets);
  }
}
