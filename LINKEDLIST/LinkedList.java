// corner case are those cases which are diffrent from normal cases
//  and there will some special kind of functinality in that.
// Linked List Insertion
// Search an element in a Linked List (Iterative and Recursive)
// Find Length of a Linked List (Iterative and Recursive)
// Reverse a linked list
// Linked List Deletion (Deleting a given key)
// Linked List Deletion (Deleting a key at given position).
// Write a function to delete a Linked List.
// Write a function to get Nth node in a Linked List.
// Nth node from the end of a Linked List.
//  Linked list just by using some collection Frame_work.

import java.util.*;
class LinkedList{
    public static void main(String[]args){
        LinkedList<String>list = new LinkedList<String>();
        list.add("Life");
        list.add("without");
        list.addLast("songs");
        list.addLast("totally_boring");
        System.out.println(list);
          list.addFirst("My");
          System.out.println(  " elements after removing the elements will be: " + list);
            System.out.println("the element at zeroth index will be "+list.get(0));
            System.out.println(  "the size of linked list will be "  +list.size());
          list.remove(2);
          list.removeFirst();
          list.removeLast();
           System.out.println( " elements after removing the elements will be: " +list);
    }
}




