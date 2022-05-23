import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.net.Socket;

public class MathClient {
  public static void main(String[] args) {
    String hostname = "localhost";
    int port = 10000;
    if (args.length != 2) {
      System.out.println("use the default setting ...");
    } else {
      hostname = args[0];
      port = Integer.parseInt(args[1]);
    }
    try {
      Socket socket = new Socket(hostname, port);
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      writer.write("+:12:21");
      writer.newLine();
      writer.flush();
      BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      System.out.println(reader.readLine());
      reader.close();
      writer.close();
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}
