import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Iterator;

public class blockingqueue {
  static void print_blocking_queue(BlockingQueue blq){
    Iterator blqitr = blq.iterator();
    while (blqitr.hasNext()) {
      System.out.println(blqitr.next());
    }
  }

  public static void main(String[] args){
    BlockingQueue movies = new ArrayBlockingQueue(3);
    try {
    movies.add("Starwars");
    movies.add("SuperMan");
    movies.add(87);
    print_blocking_queue(movies);

    movies.add(1919);
    print_blocking_queue(movies);
    } catch(Exception e){
    }

    movies.remove("Starwars");
    movies.add(1919);
    print_blocking_queue(movies);
  }
}
