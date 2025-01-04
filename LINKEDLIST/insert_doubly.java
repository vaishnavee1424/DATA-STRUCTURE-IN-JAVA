class insert_doubly{
    public static void main(String []args){
        insert_doubly list= new insert_doubly();
        // list.insert(6);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.print();
         list.add_last(5);
          list.print();
}

    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
     public void insert(int data){
        Node new_node=new Node(data);
            if(head==null){
                head=new_node;
               return;
            }
             head.prev=new_node;
             new_node.prev=null;
             new_node.next=head;
             head=new_node;
        
     }
     
     public void add_last(int data) {
    Node last = new Node(data);
    if (head == null) {
        head = last;
        return;
    }

    Node current = head;
    while (current.next != null) {
        current = current.next;
    }

    current.next = last;
    last.prev = current;
    last.next = null;
      }

     // you just did a small mistake which u did correct over a paper but not correct over at your
     
     
    //  public void add_last(int data){
    //      Node last=new Node(data);
    //      if(head==null){
    //          head=last;
    //          return;
    //      }
    //      while(head.next!=null){
            
    //          head=head.next;
    //      }
    //       head.next=last;
    //      last.next=null;
    //      last.next=head;
         
    //     //  head=last;
         
    //  }
    
     
    public void print(){
        
      Node traverse=head;
       if(head==null){
                
              System.out.print("empty list");
            }
            //yaha esa kyu ki while(traverse.next!=null likh dungi toh ek print hi hoga akhir wala.
        //esa islye kyuki agr traverse.next likhungi toh woh head wale ke nwxt wale se print karna shuru karega.
      while(traverse!=null){
       System.out.print(traverse.data+"->");
         traverse=traverse.next;
      }
      System.out.println("end");
       }
}