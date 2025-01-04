// import java.util.*;

// class main{
//     public static void main(String[]args){
//         LinkedList <String> list = new <String>LinkedList();
//          list.add("1");

//          list.add("4");
//          list.add("7");
//          list.add("9");
//          list.add("7");
//          System.out.println(list);

//     }
// }

// building all singly list concept from its scratch and that would be:


class main{
    Node head;
    public static void main(String[]args){
       main list=new main();
       list.addingF("is");
       list.addingF("it");
       list.addingL("a");
       list.addingL("lake");
      list.print();

    }
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=next;
        }
    }
    
    public void addingF (String data){
      Node newnode=new Node(data);
      if(head==null){
        head=newnode;
        return;
      }
      newnode.next=head;
      head=newnode;
    }
    public void addingL(String data){
        Node newnode =new Node(data);
            if(head==null){
                head=newnode;
                return;

            }
            Node lastnode=head;
            while(lastnode.next!=null){
                lastnode=lastnode.next;
            }
            // newnode.next=newnode;
            lastnode.next=newnode;
            // newnode=lastnode;
        }
        public void print(){
            if(head==null){
                System.out.print("List is empty now");
            }
            Node lastnode=head;
            while(lastnode.next!=null){
                System.out.println(lastnode.data);   
                lastnode=lastnode.next;           
            }
            System.out.print("null");
        }
    }























