class Node {
  int value;
  Node nextNode;

  public Node(int value){
    this.value = value;
  }

  @Override
  public String toString() {
    return Integer.toString(this.value);
  }

}

public class circularlinkedlist {
  private Node head = null;
  private Node tail = null;

  public boolean containsNode (int searchValue){
    Node currentNode = head;
    if(head == null){
      return false;
    } else {
      do {
        if(currentNode.value == searchValue){
          return true;
        }
        currentNode = currentNode.nextNode;
      } while (currentNode != tail);
      return false;
    }
  }

  public void addNode(int value){
    Node newNode = new Node(value);

    if (head == null) {
      head = newNode;
    } else {
      tail.nextNode = newNode;
    }

    tail = newNode;
    tail.nextNode = head;
  }

  public void deleteNode(int valueToDelete) {
    Node currentNode = head;

    if (head == null) {
      return;
    }   

    do {
      Node nextNode = currentNode.nextNode;
      if(nextNode.value == valueToDelete) {
        if(tail == head){
          head = null;
          tail = null;
        } else {
          currentNode.nextNode = nextNode.nextNode;
          if(tail == head){
            head = head.nextNode;
          }
          if(tail == nextNode) {
            tail = currentNode;
          }
        }
        break;
      }
    } while (currentNode != head);
  }

}
