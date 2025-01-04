// It is not done yet!
// ha bhen isko delete bhi karti hu

public class delete_doubly {
    public static void main(String[]args){
       delete_doubly list =new delete_doubly();
       list.add_first(7);
       list.add_first(8);
       list.add_first(9);
       System.out.println("value of the list before the deletion");
       list.print();
       System.out.println("value of the list after the deletion");
    }
   Node head;
   class Node{
    int val;
    Node prev;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
        this.prev=null;
    }
   }
   public void add_first(int val){
    Node new_node=new Node(val);
    
    if(head==null){
        head=new_node;
        return;
    }
     new_node.next=head;
        new_node.prev=null;
        head.prev=new_node;
        head=new_node;
   }
   public void remove(int val){

   }
   public void print(){
    Node traverse=head;
    while(traverse!=null){
        System.out.print(traverse.val+"->");
        traverse=traverse.next;
    }
     System.out.println("Finish");
   }
  
}



// this is the case of deletion can't understant it now.
public void remove(int value) {
    if (head == null) {
        System.out.println("Empty list, nothing to remove.");
        return;
    }
    // Case 1: If the node to be removed is the head
    if (head.data == value) {
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return;
    }
    // Case 2: If the node to be removed is in the middle or at the end
    Node current = head;
    while (current != null && current.data != value) {
        current = current.next;
    }

    if (current == null) {
        System.out.println("Node with value " + value + " not found in the list.");
        return;
    }

    // Adjust pointers to bypass the node
    if (current.prev != null) {
        current.prev.next = current.next;
    }
    if (current.next != null) {
        current.next.prev = current.prev;
    }
}
