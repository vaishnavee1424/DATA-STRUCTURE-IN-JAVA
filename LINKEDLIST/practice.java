// Take elements(numbers in the range of 1-50) of a Linked List as input from the user
// . Delete all nodes which have values greater than 25.
class practice{
    Node head;
    public static void main(String[]args){
        // parameter  passing or giving input 
        practice list=new practice();
        list.addfirst("2");
        list.addfirst("1");
        
        list.print();
        list.add_last("3");
        list.print();
     }
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
   // newnode ->[data|nextpointer]
    // head
    // -> 1->2->3->4->5->tail.
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
        head=newnode;
        return;
        }
        newnode.next=head;
        head=newnode;
    }
     // newnode ->[data|nextpointer]
    // head
    // -> 1->2->3->4->5->tail.
    // lastnode just a variable to traverse this list. hamko newnode ko last mai add karna hai.
    public void add_last(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node lastnode=head;
        while(lastnode.next!=null){
            lastnode=lastnode.next;
        }                             
        // newnode.next=newnode;
        // is they both are equall to each other??
        lastnode.next=newnode;
    }
    public void print(){
       if(head==null){
        System.out.print("List is empty now");
       }
       Node lastnode=head;
       while(lastnode!=null){
        System.out.print(lastnode.data+"->");
        lastnode=lastnode.next;
       }
       System.out.print(" null");
    }
   
}
// dekho bhai dekho kis is code ma kya dikat ho gyi
