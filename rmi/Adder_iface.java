import java.rmi.*;

public interface Adder_iface extends Remote {
  public int add ( int x, int y) throws RemoteException;
}
