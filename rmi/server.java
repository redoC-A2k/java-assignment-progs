import java.rmi.*;
import java.rmi.registry.*;

public class server {
  public static void main(String[] args) {
    try {
      Adder_iface stub = new AdderRemote();
      Naming.rebind("rmi://localhost:5000/rmi", stub);
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}
