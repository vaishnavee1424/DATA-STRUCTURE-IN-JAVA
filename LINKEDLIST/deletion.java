class deletion{
       Node head;
       private int size;
        deletion() {
       size = 0;
   }
    // lets delete an element from the linked_list .
        //  creation of a node with data and next pointer is done here!!!.
        class Node{
            String data;
            Node next;
            Node(String data){
                this.data=data;
                this.next=null;
                size++;
                 }
              }
            // adding an element at first position or creating a new node if none list is existed. 
            public void add_first(String data){
                Node new_node=new Node(data);
                if(head==null){
                    head=new_node; 
                    return;
                }
                new_node.next=head;
                head=new_node;
                size++;
            } 
            public void add_last(String data){
                Node new_node=new Node(data);
                if(head==null){
                    head=new_node; 
                    return;
                }
                Node lastnode = head;
                while(lastnode.next!=null){
                lastnode=lastnode.next;
                }
                 lastnode.next=new_node;
            }
            public void print_list(){
                if(head==null){
                    System.out.println("empty list");
                }
                Node lastnode=head;
                
                while(lastnode!=null){
                System.out.print(lastnode.data+"->");
                lastnode=lastnode.next;
              
                }
                 System.out.println("Null");
            }
            // deleting the first_element in linkedlist.
            public void delete_first(){
                if(head==null){
                    System.out.println("this list is empty");
                    return ;
                }
                head=head.next;
                size--;
            }
            
            //  deleting an element at its last_position .
            public void delete_last(){
                if(head==null){
                    System.out.println("this list is empty");
                    return;
                }
                size--;
                if(head.next==null){
                    head=null;
                    return;
                }
                // Node delete_node=head;
                // while(delete_node!=null){
                //     delete_node=delete_node.next;
                    
                    
                // }
                // delete_node.next=null;
                // why it is not possible to written this code only.for the execution itself.
               Node secondlast_node=head;
               Node lastnode=head.next;
               while(lastnode!=null){
                    lastnode=lastnode.next;
                    secondlast_node=secondlast_node.next;
                    
                }
                secondlast_node.next=null;
                
        
            }
             
                      public int getSize() {
                      return size;
                        }

            public static void main(String []args){
            deletion list=new deletion();
                list.add_first("a");
                list.add_first("is");
                list.add_first("This");
                list.print_list();
                
                list.add_last("list");
                list.print_list();
                
                list.delete_first();
                list.print_list();
                
                list.delete_last();
                list.print_list();
                
              System.out.println( list.getSize());
               list.add_first("This");
               System.out.println( list.getSize());
           
             }
             
}
                
//  some easy steps are remained.