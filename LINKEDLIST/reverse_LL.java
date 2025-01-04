// Reversing Linked list 

public class reverse_LL {
    public static void main(String[]args){
       reverse_LL list =new reverse_LL();
       list.add_first(7);
       list.add_first(8);
       list.add_first(9);
       System.out.println("Normal Linked list");
       list.print();
      
    }
    Node head;
    class Node{
    Node prev;
    int val;
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
   // 9->8->7
   // desired 7->8->9
  
   
   public void print(){
    Node traverse=head;
    Node last=null;
    while(traverse!=null){
        System.out.print(traverse.val+"->");
        last=traverse;
        traverse=traverse.next;

    }

     System.out.println("Finish");
     System.out.print("Reverse linked list:");
     while(last!=null){
        System.out.print(last.val+"->");
        last =last.prev;
     }
     System.out.println("START");
   }
  
}

