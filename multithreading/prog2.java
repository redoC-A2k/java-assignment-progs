class extendThread extends Thread {
  @Override
  public void run(){
    Thread.currentThread().setPriority(2);
    System.out.println("child thread - "+Thread.currentThread().getPriority());
    for (int i = 0; i < 10; i++) {
      System.out.println("child Thread");
    }
  }
}

public class prog2 {
  public static void main(String[] args) {
    extendThread t = new extendThread();
    System.out.println("main thread - "+Thread.currentThread().getPriority());
    t.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("main thread");
    }
  }
}
