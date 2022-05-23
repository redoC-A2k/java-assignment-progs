public class prog8 extends Thread {
  public void run() {
    System.out.println("running...");
  }

  public static void main(String args[]) {
    prog8 t1 = new prog8();
    prog8 t2 = new prog8();
    System.out.println("Name of t1:" + t1.getName());
    System.out.println("Name of t2:" + t2.getName());

    t1.start();
    t2.start();

    t1.setName("I am first thread");
    System.out.println("After changing name of t1:" + t1.getName());
  }
}
