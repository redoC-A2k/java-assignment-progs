class Table {
  void printTable (int n,String name) {
    for (int i = 1; i<=5 ; i++) {
      System.out.println(name+" - "+n+"*"+i+"="+n*i);
    }
  }
}

class MyThread1 extends Thread {
  Table t ;
  MyThread1(Table t){
    this.t = t;
  }
  public void run(){
   t.printTable(5,Thread.currentThread().getName());
  }
}

class MyThread2 extends Thread {
  Table t ;
  MyThread2(Table t){
    this.t = t;
  }
  public void run(){
    t.printTable(100, Thread.currentThread().getName());
  }
}

public class prog4 {
  public static void main(String[] args) {
    Table obj = new Table();
    MyThread1 t1 = new MyThread1(obj);
    MyThread2 t2 = new MyThread2(obj);
    t1.start();
    t2.start();
  }
}
