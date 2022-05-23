import java.util.Stack;

public class stack_generic_foreach {
  public static void main(String[] args) {
    Stack<String> obj = new Stack<>();
    obj.push("afshan");
    obj.push("ahmed");
    obj.push("rohan");
    obj.push("mohan");
    System.out.println(obj);
    obj.pop();
    System.out.println("size of stack is " + obj.size());
    System.out.println("capacity is " + obj.capacity());
    System.out.println("is stack empty?" + obj.empty());
    System.out.println("peek of stack -" + obj.peek());
    System.out.println("last element of stack is - " + obj.lastElement());
    System.out.println("Traversing the stack through the foreach");
    for (String s : obj) {
      System.out.println(s);
    }
  }
}
