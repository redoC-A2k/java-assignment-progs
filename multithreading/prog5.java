class Counter {
  int count = 0;
  public void increment(){
    count = count + 1;
  }
  public int getCount() {
    return count;
  }
}

class MyThread1 extends Thread {
  Counter counter;
  MyThread1(Counter counter){
    this.counter = counter;
  }
  public void run(){
    counter.increment();
  }
}

class MyThread2 extends Thread {
  Counter counter;
  MyThread2(Counter counter){
    this.counter = counter;
  }
  public void run(){
    counter.increment();
  }
}

public class prog5 {
  public static void main(String[] args) {
    Counter obj = new Counter();
    while (obj.getCount() <= 100) {
      new MyThread1(obj).start();
      new MyThread2(obj).start();
    }
    System.out.println(obj.getCount());
  }
}
