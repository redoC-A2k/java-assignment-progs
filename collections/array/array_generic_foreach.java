import java.util.Arrays;
import java.util.Iterator;

public class array_generic_foreach {
   public static void main(String args[]){
      Integer[] myArray = {897, 56, 78, 90, 12, 123, 75};
      for (Integer i : myArray) {
        System.out.println(i);
      }
   }
}
