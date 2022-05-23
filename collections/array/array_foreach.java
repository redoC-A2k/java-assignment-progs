import java.util.Arrays;
import java.util.Iterator;
     
public class array_foreach {
   public static void main(String args[]){
      Object[] myArray = {897,"afshan", 56, 78, 90, "ahmed", 12, 123,"khan", 75};
      for (Object o : myArray) {
        System.out.println(o);
      }
   }
}
