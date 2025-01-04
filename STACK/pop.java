// pop item from the top of the stack 
public class pop{
  private static final int MAX_SIZE=100;
  private int top;
  int []stackArray;
  public pop(){
   top=-1;
   stackArray=new int[MAX_SIZE];
  }

  public boolean isEmpty(){
   top=-1;
   return true;
  }
  public boolean isFull(){
   top=MAX_SIZE-1;
   return true;
  }
  public void pop(int data){
   if(isFull()){
      System.out.print("cannot remove the element");
         
   }
   else{ 
     int poopedItem= stackArray[--top];
     System.out.print("tem has successfully removed");

   }

  }
  public static void main(String[]args){
   pop stack=new pop();
    stack.pop(2);
  }
}
// got successed.