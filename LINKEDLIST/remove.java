

class remove{
    Node head;
    public static void main(String[]args){
       remove list=new remove();
       list.add_last(1);
       list.add_last(2);
       list.add_last(3);
       list.add_last(4);
       list.print();
       list.delete(1);
        list.print();
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void add_last(int data){
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
    // Delete a node with a specific value
    // I Din't declare this key before is it acceptable
    public void delete(int key) {
        Node current = head;
        Node prev = null;

        // Check if the node to be deleted is the head
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // Search for the node to be deleted
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If the node with the key is not present
        if (current == null) {
            System.out.println("Key not found in the linked list.");
            return;
        }

        // Unlink the node to be deleted
        prev.next = current.next;
    }
    public void print(){
        if(head==null){
           System.out.println("empty list hai bhai");
        }
       Node lastnode = head;
       while(lastnode.next!=null){
        System.out.print(lastnode.data+"->");
        lastnode=lastnode.next;
       }
      System.out.println("null ho gyi bhai");
    }
}
   