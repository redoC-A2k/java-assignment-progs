import java.net.URL;

public class urldemo {
  public static void main(String[] args) {
    try {
      URL url = new URL("http://www.google.com/");
      System.out.println("Protocol "+ url.getProtocol());
      System.out.println("Host name "+ url.getHost());
      System.out.println("Port number "+ url.getPort());
      System.out.println("File name"+ url.getFile());
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}
