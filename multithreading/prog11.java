class MyThread extends Thread {
  public void run() {
    for (int i = 0; i < 5; ++i) {
                      // main thread
      Thread.yield(); // By calling this method, MyThread stop its execution and giving a chance to a
                      // main thread
      System.out.println("Thread started:" + Thread.currentThread().getName());
    }
  }
}

public class prog11 {
  public static void main(String[] args) {
    MyThread thread = new MyThread();
    thread.start();
    for (int i = 0; i < 5; ++i) {
      System.out.println("Thread started:" + Thread.currentThread().getName());
    }
    System.out.println("Thread ended:" + Thread.currentThread().getName());
  }
}
