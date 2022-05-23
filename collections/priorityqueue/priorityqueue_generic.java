import java.util.Iterator;
import java.util.PriorityQueue;

class priorityqueue_generic {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Using the add() method
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);

        // Using the offer() method
        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);

        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
          System.out.println(itr.next());
        }
    }
}

