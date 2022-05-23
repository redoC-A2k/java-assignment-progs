class extendThread extends Thread {
  @Override
  public void run(){
    try {
      for (int i = 0; i < 10; i++) {
        System.out.println("child Thread");
        Thread.sleep(100);
      }
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}

public class prog3 {
  public static void main(String[] args) throws InterruptedException {
    extendThread t = new extendThread();
    t.start();
    t.interrupt();
    for (int i = 0; i < 10; i++) {
      Thread.sleep(300);
      System.out.println("main thread");
    }
  }
}
