import java.util.Iterator;
import java.util.PriorityQueue;

class priorityqueue {
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue numbers = new PriorityQueue();
        // Using the add() method
        numbers.add(4);
        numbers.add(2);
        // Using the offer() method
        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);
        Iterator itr = numbers.iterator();
        while (itr.hasNext()) {
          System.out.println(itr.next());
        }
    }
}

