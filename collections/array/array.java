import java.util.Arrays;
import java.util.Iterator;
     
public class array {
   public static void main(String args[]){
      Object[] myArray = {897,"afshan", 56, 78, 90, "ahmed", 12, 123,"khan", 75};
      Iterator iterator = Arrays.stream(myArray).iterator();
      while(iterator.hasNext()) {
         System.out.println(iterator.next());
      }
   }
}
