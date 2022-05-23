class myThread extends Thread {
  myThread(String threadname, ThreadGroup grp) {
    super(grp, threadname);
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      try {
        System.out.println(this.getName() + " - " + i);
        Thread.sleep(10);
      } catch (InterruptedException ex) {
        System.out.println("Exception encounterted");
      }
    }
  }
}

public class prog13 {
  public static void main(String[] args) throws InterruptedException{
    ThreadGroup grp = new ThreadGroup("mythrdgrp");
    myThread t1 = new myThread("thread1", grp);
    myThread t2 = new myThread("thread2", grp);
    System.out.println("starting thread t1 and t2");
    t1.start();
    t2.start();
    System.out.println("no of active thread - "+grp.activeCount());
    grp.interrupt();
    t1.join();
    t2.join();
    grp.destroy();
    System.out.println("destroyed thread "+ grp.getName());
  }
}
