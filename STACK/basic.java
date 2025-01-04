public class basic {
    // Constants
    private static final int MAX_SIZE = 100;
    

    // Instance variables
    private int top;
    private int[] stackArray;

    // Constructor
    public basic() {
        top = -1;
        stackArray = new int[MAX_SIZE];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    // Push an element onto the stack
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow. Cannot push " + item);
        } else {
            stackArray[++top] = item;
            System.out.println(item + " pushed onto the stack");
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow. Cannot pop from an empty stack");
            return -1; // Return a default value indicating failure
        } else {
            int poppedItem = stackArray[top--];
            System.out.println(poppedItem + " popped from the stack");
            return poppedItem;
        }
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Return a default value indicating failure
        } else {
            return stackArray[top];
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        basic stack = new basic();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element of the stack: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Top element of the stack after popping: " + stack.peek());
    }
}
