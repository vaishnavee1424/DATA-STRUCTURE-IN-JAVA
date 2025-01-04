// push item on the top of the stack 
public class push{
   // fixing size of the array;
   private static final int MAX_SIZE=100;
   //instance variable
   // just normal variable to get access from any class.
   int top;
   int []stackArray;
   // here defining an array.

   //construtor
   // similar to variable but just used to create objects ??
   // Now what are object??
   public push(){
      top=-1;
      stackArray=new int [MAX_SIZE];

    }
    
   // didn't remember why we used it to declare.
    public boolean isEmpty(){
      top=-1;
      return true;

    }

    public boolean isFull(){
      top=MAX_SIZE-1;
return true;
    }
    

public void push(int data){
      if(isFull()) {
         System.out.println("It is totally full Cannot push"+data);
            
      }
      else{
         stackArray[++top]=data;
         System.out.println(data+"is successfully pushed");
      }
      
        
      
}
public static void main(String[]args){
    push stack=new push();
    stack.push(2);
    stack.push(3);
    stack.push(4);
    System.out.println("values are"+stack);

}
}

