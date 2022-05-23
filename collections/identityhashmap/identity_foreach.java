import java.util.IdentityHashMap;
public class identity_foreach {
  public static void main(String[] args){
    IdentityHashMap vegetables = new IdentityHashMap();
    vegetables.put("Tomato", 15);
    vegetables.put("Onion", 10);
    vegetables.put("Brinjal", 20);
    vegetables.put("Lady-finger", 25);
    vegetables.put(2,"Cauliflower");
    vegetables.put(2, "Cabbage");

    vegetables.forEach((k,v)->{
      System.out.println("Key = "+k+", Value = "+v);
    });
  }
}

