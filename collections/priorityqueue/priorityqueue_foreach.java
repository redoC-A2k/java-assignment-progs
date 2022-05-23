import java.util.PriorityQueue;

public class priorityqueue_foreach {
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue numbers = new PriorityQueue();
        // Using the add() method
        numbers.add(4);
        numbers.add(9);
        numbers.add(2);
        // Using the offer() method
        numbers.offer(1);
        numbers.offer(7);
        System.out.println(numbers);
        numbers.remove();
        System.out.println(numbers);
        numbers.remove();
        for (Object o : numbers ) {  
          System.out.println(o);
        }
    }
}

