import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class vector {
  public static void main(String[] args) {
    Vector obj = new Vector();
    obj.add("afshan");
    obj.add("it-2k19-03");
    obj.add("iips davv");
    obj.insertElementAt(34, 3);
    obj.insertElementAt(14, 4);
    obj.insertElementAt(99, 5);
    obj.remove(1);
    obj.removeElement(34);
    System.out.println("the last element of vector list is " + obj.lastElement());
    System.out.println(obj);

    Iterator itr = obj.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
    System.out.println("On replacing iips-davv ");
    obj.set(2, "International institute of proffessional studies");
    System.out.println(obj);

    System.out.println("the hash code of given vector is " + obj.hashCode());
  }
}
