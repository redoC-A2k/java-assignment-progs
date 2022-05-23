import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class serverFirst {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(3333);
    Socket s = ss.accept();
    DataInputStream din = new DataInputStream(s.getInputStream());
    String str = (String)din.readUTF();
    System.out.println("messsage is " + str);
    ss.close();
  }
}
