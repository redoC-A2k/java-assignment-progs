import java.rmi.*;

public class client{
  public static void main(String[] args) {
    try {
      Adder_iface stub = (Adder_iface) Naming.lookup("rmi://localhost:5000/rmi");
      System.out.println(stub.add(4,4));
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}
