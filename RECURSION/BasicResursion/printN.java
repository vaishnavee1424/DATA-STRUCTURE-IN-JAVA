// 07-02-2025

// public class printN {
//     public static void main (String [] args){
//       printNum(5);
//     }
//     public static void printNum(int N){

//        System.out.println("1");
//        printNum(N);
//     }
// }


// the end lessly problem is called stackover flow calling the function again and again


public class printN {
   static int count=5;
    public static void main (String [] args){
       
      printNum();
    }
    public static void printNum(){
      if(count==0){
        return;
      }
       System.out.println("1");
        count--;
       printNum();
    }
}