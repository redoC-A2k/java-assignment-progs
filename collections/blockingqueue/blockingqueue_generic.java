import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Iterator;

public class blockingqueue_generic {
  static void print_blocking_queue(BlockingQueue<String> blq){
    Iterator<String> itr = blq.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
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
    movies.remove("Avengers");
    movies.add("IronMan");
    print_blocking_queue(movies);
  }
}
