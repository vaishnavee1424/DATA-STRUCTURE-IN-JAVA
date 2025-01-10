//            [1]
//         /      \
//      [2]        [3]
//      / \        / \
//    [4] [5]    [6] [7]
// Level-ordering =[1,2,3,4,5,6,7]

// class Node {
//     // Stores the value
//     // of the node
//     int data;       
//     // Reference to the
//     // left child node
//     Node left; 
//     // Reference to the
//     // right child node
//     Node right;

//     // Constructor to initialize
//     // a node with a given key
//     public Node(int key) {
//         // Assigns the provided key to
//         // the data field of the node
//         data = key;     
//         // Initializes left child 
//         // reference as null
//         left = null;    
//         // Initializes right child
//         // reference as null
//         right = null;   
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//             // Creates the root node
//             // with a key value of 1
//         Node root = new Node(1);       
//         // Creates a left child node for
//         // the root with a key value of 2
//         root.left = new Node(2);       
//             // Creates a right child node for
//             // the root with a key value of 3
//         root.right = new Node(3);      
//             // Creates a left child node for the right 
//             // child of the root with a key value of 5
//         root.right.left = new Node(5); 
//     }
// }


public class level-order{
    public static void main(String[]args){
      Node root=new Node(1); 
      root.left=new Node(2);
      root.right=new Node(3);
      root.left.left=new Node(4);
      root.left.right=new Node(5);
      root.right.left=new Node(6);
      root.right.right=new Node(7);
    }
}
 
class Node{
    //Storing the value 
    int data;
    Node left; 
    // Reference to left
    Node right;
    //  Reference to right

    // Constructor to initialize a node with a given key
    public Node (int key){
        data=key;
        left=null;
        right=null;

    }

}
