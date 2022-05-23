import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.ServerSocket;


public class MathServer {
  protected MathService mathService;
  protected Socket socket;

  public void setMathService(MathService mathService) {
    this.mathService = mathService;
  }

  public void setSocket(Socket socket) {
    this.socket = socket;
  }

  public void execute () {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      String line = reader.readLine();
      double result = parseExecution(line);
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      writer.write(""+result);
      writer.flush();
      reader.close();
      writer.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  protected double parseExecution(String line) throws IllegalArgumentException {
    double result = Double.MAX_VALUE;
    String  [] elements = line.split(":");
    if(elements.length != 3)
      throw new IllegalArgumentException("Parsing error !");
    double firstValue = 0;
    double secondValue = 0;
    try {
      firstValue = Double.parseDouble(elements[1]);
      secondValue = Double.parseDouble(elements[2]);
    } catch (Exception e) {
      throw new IllegalArgumentException("Invalid arguments!");
    }

    switch (elements[0].charAt(0)) {
      case '+':
        result = mathService.add(firstValue, secondValue);
        break;
      case '-':
        result = mathService.sub(firstValue, secondValue);
        break;
      case '*':
        result = mathService.mul(firstValue, secondValue);
        break;
      case '/':
        result = mathService.div(firstValue, secondValue);
        break;
      default:
        throw new IllegalArgumentException("Invalid math operation!");
    }
    
    return result;
  }

  public static void main(String[] args) throws Exception {
    int port = 10000;
    if (args.length == 1) {
      try {
        port = Integer.parseInt(args[0]);
      } catch (Exception e) {
        System.out.println("Error changing port");
        e.printStackTrace();
      }
    }
    System.out.println("Math server is running ...");
    ServerSocket serverSocket = new ServerSocket(port);
    Socket socket = serverSocket.accept();
    MathServer mathServer = new MathServer();
    mathServer.setMathService(new ImplMathService());
    mathServer.setSocket(socket);
    mathServer.execute();
    socket.close();
    System.out.println("Math server is closed");
  }
}
