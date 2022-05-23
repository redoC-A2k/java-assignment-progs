class myRunnable implements Runnable {
  @Override
  public void run(){
    for (int i = 0; i < 10; i++) {
      System.out.println("child Thread");
    }
  }
}

public class prog10 {
  public static void main(String[] args) {
    myRunnable t = new myRunnable();
    Thread t1 = new Thread(t);
    t1.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("main thread");
    }
  }
}
