public class prog9 extends Thread {
  public void run() {
    if (Thread.currentThread().isDaemon()) {// checking for daemon thread
      System.out.println("daemon thread work");
    } else {
      System.out.println("user thread work");
    }
  }

  public static void main(String[] args) {
    prog9 t1 = new prog9();// creating thread
    prog9 t2 = new prog9();
    prog9 t3 = new prog9();

    t1.setDaemon(true);// now t1 is daemon thread

    t1.start();// starting threads
    System.out.println("Is thread t1 daemon - "+t1.isDaemon());
    t2.start();
    t3.start();
  }
}
