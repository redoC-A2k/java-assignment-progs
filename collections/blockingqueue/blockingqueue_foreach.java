import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class blockingqueue_foreach {
  static void print_blocking_queue(BlockingQueue blq){
    blq.forEach((o)->{
      System.out.println(o);
    });
  }

  public static void main(String[] args){
    BlockingQueue movies = new ArrayBlockingQueue(3);
    movies.add("Starwars");
    movies.add("SuperMan");
    movies.add(87);
    print_blocking_queue(movies);

    movies.add(1919);
    print_blocking_queue(movies);

    movies.remove();
    movies.add(1919);
    print_blocking_queue(movies);
  }
}
