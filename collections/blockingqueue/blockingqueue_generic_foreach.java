import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class blockingqueue_generic_foreach {
  static void print_blocking_queue(BlockingQueue<String> blq){
    for (String eachblq : blq) {
      System.out.println(eachblq);
    }
  }

  public static void main(String[] args){
    BlockingQueue<String> movies = new ArrayBlockingQueue<>(3);
    try {
      movies.add("Starwars");
      movies.add("SuperMan");
      movies.add("Avengers");
      print_blocking_queue(movies);

      movies.add("IronMan");
      print_blocking_queue(movies);
    } catch(Exception e){
    }

    movies.remove();
    movies.add("IronMan");
    print_blocking_queue(movies);
  }
}
