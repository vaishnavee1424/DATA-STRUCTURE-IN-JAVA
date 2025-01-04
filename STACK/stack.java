public class stack {
     
        // declaring size of stack permanent.
        private static final int MAX_SIZE=100;

       // what are instance variable and what is the use of instance variable??

        private int top;// declared variable
        private int[] stackArray; // declared an array;
          

      // what are constructor and what is the use of constructor ??

      public stack(){
        top=-1;
        stackArray=new int [MAX_SIZE];

      }
      //check if the stack is empty
      //why error occur when I used static in the line.
      public boolean isEmpty(){
        return  top==-1;
      }
      //check if the stack is full
      public boolean isfull(){
        return top== MAX_SIZE-1;
      }
    // pushing an element and checking it.
    public void push(int item){
        if(isfull()){
       System.out.println("unable to push an element because it is full");
        }
        else{
            stackArray[++top]=item;
            System.out.println("item is successfully pushed"+item);     
        }
    }
    //poping an element
    public int pop(){
        if(isEmpty()){
            System.out.println("Cannot pop any element this is empty");
            return -1;
        }
        else{
            int poopedItem = stackArray[--top];
            return poopedItem;
        }
    }
    
    //peek (showing the top most element of the stack)
    public int peek(){
        if(isEmpty() ){
            System.out.println("Cannot pop any element this is empty");
            return -1;
    }
    else{
        return stackArray[top];
    }

    }
    public static void main(String[]args){
         stack Stack=new stack();
         Stack.push(3);
         Stack.push(4);
         Stack.push(5);
         System.out.println("now we are poping element 5");
         Stack.pop();
         
            }
}
    



