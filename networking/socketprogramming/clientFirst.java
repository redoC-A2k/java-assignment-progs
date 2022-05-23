import java.net.Socket;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;

public class clientFirst {
  public static void main(String[] args) throws Exception{
    Socket s = new Socket("localhost",3333);
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    dout.writeUTF("Hello server");
    dout.flush();
    dout.close();
    s.close();
  }
}
