import java.util.*;

public class linkedlistapitest {
    

   static public void main(String[] args){
    // create an integer linked List 
    LinkedList<Integer> head = new LinkedList<Integer>();
    // add elements: 2,5,8,9
    head.add(2);
    head.add(5);
    head.add(8);
    head.add(9);

    // print all elements :2 5 8 9
    LinkedList<Integer> current = head;
    Iterator<Integer> it = current.iterator();
    while(it.hasNext()){
        System.out.print(it.next() + " ");
    }
    System.out.println();
    // delete first element
    head.remove();

    // print head : 5
    System.out.println(head.peek());
   }

}
