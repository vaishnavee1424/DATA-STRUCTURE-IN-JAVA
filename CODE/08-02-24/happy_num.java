//Leetcode question Define a number is a happy number or not!!.
// import java.util.*;
// class happy_num {
//     Node head;
//     class Node{
//         int n;
//         Node next;
//         Node(){
//            this. n=n;
//            this.next=null;
          
//         }
//     }
//     // public static void main(String[]args){
//     //     Scanner sc=new Scanner(System.in);
//     //     System.out.println("Enter any number:");
//     //       int n=sc.nextInt();
//     //       int sum=0;    
//     //       int remain;
//     //       while(sum!=1){
//     //         while(n!=0){
//     //             remain=n%10;
//     //             sum+=remain*2;
//     //             n=n/10;
//     //           }      
//     //     System.out.println(n+"it is a happy number");             
//     //       }
          
//     // } 

//     // this will create a infinite loop.

//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter any number:");
//           int n=sc.nextInt();
//           int sum=0;    
//           int remain;
//           while(sum!=1){
//             while(n!=0){
//                 remain=n%10;
//                 sum+=remain*2;
//                 n=n/10;
//               }      
//         System.out.println(n+"it is a happy number");             
//           }
//           // mujhe is sum ka pointer genrate karna hai or usko  head se link krke dena hai but huw
//     } 
//     // public void happy_num(){
//     //     Node newnode=new Node();
//     //     if(head==null){
//     //       head=newnode;
//     //     }

//     // }

// }
class happy_num{
  public boolean isHappy(int n){
    int slow=n;
    int fast=n;
    do{
      slow=findSquare(slow);
      fast=findSquare(findSquare(fast));
  
    }while(slow!=fast);
    if(slow==1){
      return true;
    }
  return false;
  
  }
  private int findSqaure(int number){
    int sum=0;    
    int remain;
    while(number!=0){
      remain=number%10;
      sum+=remain*2;
      number=number/10;
    }     
   }
   return sum;
   
}
// run it over leetcode!!.
