import java.util.*;

public class stack {
  public static void main(String[] args) {
    // Creating a Stack
    Stack nos = new Stack();
    // pushing values in stack
    nos.push("This is the start");
    for (int i = 0; i <= 10; i++) {
      nos.push(i);
    }
    nos.push("This is the end");

    Iterator itr = nos.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    System.out.println("after removing the element at index 1");
    nos.removeElementAt(1);
    System.out.println(nos);

    // printing the stack
    System.out.println("Print Stack before pop:");
    System.out.println(nos);
    System.out.println("Position of 8 from the top is " + nos.search(8));
    System.out.println("Position of 10 from the top is " + nos.search(10));

    // returning the number at the top of the stack and removing it
    System.out.println("pop => " + nos.pop());
    System.out.println("pop => " + nos.pop());
    System.out.println("pop => " + nos.pop());

    // printing the stack
    System.out.println("Print Stack after pop:");
    System.out.println(nos);
    // accessing the number at the top of the stack but not removing it
    System.out.println("Number on top of the stack is => " + nos.peek());
    // checking if the stack is empty or not
    System.out.println("Is stack empty?  Ans:" + nos.empty());
  }
}
