import java.util.ArrayList;
import java.util.List;

public class list_foreach {
  public static void main(String[] args) {
    List obj = new ArrayList();
    obj.add("MTECH");
    obj.add("BCA");
    obj.add("MBA");
    obj.add("MCA");
    obj.add(9920);
    obj.add(12089);
    System.out.println("traversing with foreach loop");
    for (Object o : obj ) {    
      System.out.println(o); 
    }
  }
}
