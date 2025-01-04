// we are learning to delete an element from the linked list.
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
// creation of a node separatly.
class LinkedList {
    Node head;
    // Insert a new node at the end of the linked list
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Delete a node with a specific value
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
}
public class Main {
    public static void main(String[] args) {
        LinkedList List = new LinkedList();
        // Insert some elements into the linked list
        List.append(1);
        List.append(2);
        List.append(3);
        List.append(4);
        System.out.println("Original linked list:");
        List.display();
        // Delete a node with the value 2
       List.delete(2);
        System.out.println("Linked list after deleting 2:");
        List.display();
    }
}

