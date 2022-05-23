import java.util.Stack;
import java.util.Vector;

public class stack_foreach {
  public static void main(String[] args) {
    Stack stk = new Stack();
    // pushing elements into Stack
    stk.push("tomato");
    stk.push("brinjal");
    stk.push("cauliflower");
    stk.push("chilli");
    stk.push(1);
    stk.push(2);

    boolean result = stk.empty();
    System.out.println("Is the stack empty or not? " + result);

    int x = stk.size();
    System.out.println(x + " - is the size of stack");
    // Access element from the top of the stack
    Object vegetable  = stk.peek();
    // prints stack
    System.out.println("Element at top: " + vegetable);
    for (Object i : stk) {
      System.out.println(i);
    }
  }
}
