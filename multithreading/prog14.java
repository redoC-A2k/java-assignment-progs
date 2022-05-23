
class ThreadDemo extends Thread {
  ThreadDemo(String a, ThreadGroup b) {
    super(b, a);
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(10);
      } catch (InterruptedException ex) {
        System.out.println("Exception encountered");
      }
    }
    System.out.println(Thread.currentThread().getName());
  }
}

public class prog14 {
  public static void main(String arg[]) throws InterruptedException, SecurityException {

    ThreadGroup grp1 = new ThreadGroup("Parent thread grp ");
    ThreadGroup grp2 = new ThreadGroup(grp1, "child thread grp ");
    ThreadDemo t1 = new ThreadDemo("this is Thread-1", grp1);
    t1.start();
    ThreadDemo t2 = new ThreadDemo("this is Thread-2", grp2);
    t2.start();
    grp1.checkAccess();
    System.out.println(grp1.getName() + " has access");
    grp2.checkAccess();
    System.out.println(grp2.getName() + " has access");
  }
}
