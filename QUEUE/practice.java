import java.util.*;
public class practice{
  

    public static void main(String[] args) {
       
        Queue<Integer> queue = new LinkedList<>();
         queue.add(65);
         queue.add(325);
         queue.add(385);
         queue.add(43207);
         queue.add(345);
         queue.add(6325);

System.out.println(queue.remove());
System.out.println(queue.remove());
System.out.println(queue.remove());
System.out.println(queue.remove());


//Doubly queue 
    

    Deque<Integer> deque = new ArrayDeque<>();
    deque.add(89);
    deque.addLast(78);
    deque.removeFirst();
    
    }
}