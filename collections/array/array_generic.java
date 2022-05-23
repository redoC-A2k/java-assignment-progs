import java.util.Arrays;
import java.util.Iterator;

public class array_generic {
   public static void main(String args[]){
      Integer[] myArray = {897, 56, 78, 90, 12, 123, 75};
      Iterator<Integer> iterator = Arrays.stream(myArray).iterator();
      while(iterator.hasNext()) {
         System.out.println(iterator.next());
      }
   }
}
