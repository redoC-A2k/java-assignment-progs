class extendThread extends Thread {
  @Override
  public void run(){
    for (int i = 0; i < 10; i++) {
      System.out.println("child Thread");
    }
  }
}

public class prog1 {
  public static void main(String[] args) {
    extendThread t = new extendThread();
    t.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("main thread");
    }
  }
}
