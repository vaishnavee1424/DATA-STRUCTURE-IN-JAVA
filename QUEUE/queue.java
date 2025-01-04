import java.util.*;
public class queue {
    public static void main(String[]args){
        Queue<Integer>queue=new LinkedList<>();
        //queue has not its own class defined actually it took data through the interface of that.
         queue.add(1);
         queue.add(2);
         queue.add(3);
         queue.add(4);
         queue.add(5);
         queue.add(6);
         System.out.println(queue.peek());
         //topmost element will appear in that.
         System.out.println(queue.remove());
         System.out.println(queue.remove());


         
//Doubly queue 
    

    Deque<Integer> deque = new ArrayDeque<>();
    deque.add(89);
    deque.addLast(78);
    deque.removeFirst();
    }
}
