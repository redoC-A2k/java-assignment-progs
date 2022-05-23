import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map.Entry;

          
public class identity_generic{
  public static void main(String[] args) {
    IdentityHashMap<String,String> identityhm = new IdentityHashMap<>();
    identityhm.put("mohan", "redmi");
    identityhm.put("rahul", "iphone");
    identityhm.put("sita", "oneplus");
    identityhm.put("laxman", "nokia");
    identityhm.put("bhim", "motorola");
    
    Iterator<IdentityHashMap.Entry<String,String>> itr = identityhm.entrySet().iterator();

    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
} 
