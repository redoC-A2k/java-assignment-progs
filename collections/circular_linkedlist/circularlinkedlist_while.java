public class circularlinkedlist_while {
  public static void main(String[] args){
    circularlinkedlist cirln = new circularlinkedlist();
    cirln.addNode(12);
    cirln.addNode(32);
  }

  public void printcircularlinkedlist(){
    Node currentNode = head;
    if (currentNode == null) {
      System.out.println("Circularlinked list is empty");
    } else {
      while (currentNode != tail) {
        System.out.println(currentNode);
        currentNode = currentNode.nextNode;
      }
        System.out.println(currentNode);
    }
  }
}
