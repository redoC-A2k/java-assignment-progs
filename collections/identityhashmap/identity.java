import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
public class identity {
  public static void main(String[] args){
    IdentityHashMap alphabets = new IdentityHashMap();
    alphabets.put(1, 'A');
    alphabets.put(2, 'B');
    alphabets.put(3, 'C');
    alphabets.put(4, 'D');
    alphabets.put(5, 'E');
    alphabets.put('A', "vowels");
    alphabets.put('E', "vowels");
    alphabets.put('I', "vowels");

    Set alphabets_entry = alphabets.entrySet();
    Iterator itr = alphabets_entry.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
