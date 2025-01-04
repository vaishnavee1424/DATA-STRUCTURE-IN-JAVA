//direct implementation!!
import java.util.*;
public class stack1 {
    public static void main(String[]args){
      Stack<Integer> stack=new Stack<>();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);
      stack.push(6);
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
    }
}
// it is not posiible to remove a middle element frequesntly
// check oop playlist for the internal application.
