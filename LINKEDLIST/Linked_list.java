//  We have written NULL in c++ while null in java;
// We always use while loop in a linkedlist via we use for loop mostly in arrays
class Linked_list{
       Node head;
        //  creation of a node with data and next pointer is done here!!!
        // head in the linked list basically used to pointing the node.
        class Node{
            String data;
            Node next;
             // next is a pointer variable;
            Node(String data){
                this.data=data;
                this.next=null;
             // why we used this keyword here!!
            // we used this keyword in java to showcase the difference 
            // between java instance variable and local varible so that jvm could not get confused through this .
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
            } 
            public void add_last(String data){
                Node new_node=new Node(data);
                if(head==null){
                    head=new_node; 
                    return;
                }
                Node lastnode=head;
                //  while(lastnode.next!=null)  we are removing lastnode.next because we want to print last  node too but i'm not 
                // getting the concept clearly.
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
             public static void main(String []args){
              Linked_list list=new Linked_list();
              //   new is the keyword here and Linked_list() is the constructor .
                list.add_first("2");
                list.add_first("1");
                list.print_list();

                list.add_last("3");
                list.print_list();
             }
}
              