// practising all stack basic implementation custom and dynamic stack
//inbuilt stack implementaion
// import java.util.*;
// class practice{
//     public static void main(String[] args) {
//         Stack<Integer> stack=new Stack<>();
//         //adding elements
//        System.out.println(stack.push(7)) ;
//        System.out.println(stack.push(8)) ;
//        System.out.println(stack.push(0)) ;
//        System.out.println(stack.push(9)) ;
//        //removing elements
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//     }
// }


//Scratch implementation
// class practice{

//     private static final int MAX_SIZE=100;

//     // puri class mai access karskte woh global ya instance variable hote hai!!
//     //  int top;
//     //  int []stack_array;
//     //Instance variable
//     private int top;
//     private int []stack_array;



//     //constuctor ka naam class ke naam par hi hona chahiye 
//    //constructor banate kyu hai??
//      public practice(){
//      top=-1;
//     stack_array=new int [MAX_SIZE];
//    }

//    //method for pushing an element 
//    public int push(int item ){
//       if(top!=MAX_SIZE-1){
//         stack_array[++top]=item;
//       }
//       return -1;
//    }
//    //method for removing an element
//    public int pop(){
//     if(top==-1){
//       return -1;
//     }
//     return stack_array[top--];
//    }
 

//    public static void main(String[] args) {
//     practice stack=new practice();
//     stack.push(76);
//     stack.push(8667);
//     stack.push(54);
//     stack.push(9);
//     System.out.println(stack.pop());
//     System.out.println(stack.pop());
//     System.out.println(stack.pop());


//    }
  
// }

// we will be building dynamic stack
