import java.util.IdentityHashMap;

public class identity_generic_foreach {
  public static void main(String[] args){
    IdentityHashMap<String,Integer> vegetables = new IdentityHashMap<>();
    vegetables.put("Tomato", 15);
    vegetables.put("Onion", 10);
    vegetables.put("Brinjal", 20);
    vegetables.put("Lady-finger", 25);

    vegetables.forEach((k,v)->{
      System.out.println("Key = "+k+", Value = "+v);
    });
  }
}

