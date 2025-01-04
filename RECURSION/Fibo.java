// package RECURSION;
// write a program to implement recursion . 
public class Fibo {
      public static void main(String[]args){
        int ans=fibo(3); // argument 
        System.out.println(ans);
      }
      static int fibo(int n){
        if (n < 2) {
          return n;
          // this is the base condition!!.
      }

           return fibo(n-1)+fibo(n-2);
           // this is the recurence relation!!.
      }

}
