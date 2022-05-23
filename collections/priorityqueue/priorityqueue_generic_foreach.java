import java.util.Iterator;
import java.util.PriorityQueue;

class priorityqueue_generic_foreach{
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        // Using the add() method
        numbers.add(4);
        numbers.add(2);
        numbers.add(7);
        // Using the offer() method
        numbers.offer(1);
        numbers.offer(3);
        System.out.println(numbers);
        numbers.remove();
        numbers.remove();
        for (int i : numbers) {  
          System.out.println(i);
        }
    }
}

