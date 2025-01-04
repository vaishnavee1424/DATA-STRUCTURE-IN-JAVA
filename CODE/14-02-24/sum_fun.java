// lets make a  normal sum function 
import java.util.*;
public class sum_fun {
    public static void main(String[]args){
    //   int ans=  sum2();
    //     System.out.println(ans );
    int ans=sum3(10,20);
    System.out.println(ans);
   // sum2 function will return the value and we will used ans variable to display this n3
    }
    //pass the value of numbers when you are calling the method in main()
    // or replacing taking input by scanner class repeatedly
    static int sum3(int a, int b){
        int sum=a+b;
        return sum;
    }
    // return the value
    static int sum2(){
         Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a num:");
        int n1=sc.nextInt();
        System.out.println("Enter second num:");
        int n2=sc.nextInt();
        // lets make a  normal sum function 
        int n3=n1+n2;
        System.out.println("Sum will be:");
        return n3;
        // you can't written anything 
    }
    static void sum(){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a num:");
        int n1=sc.nextInt();
        System.out.println("Enter second num:");
        int n2=sc.nextInt();
        // lets make a  normal sum function 
        int n3=n1+n2;
        System.out.println("Sum will be:"+n3 );
        //SYNTAX 
    /* 
    access modifiers(will be explained in )return_type name(arguments){
     //body
     return statement;
    }
     */
}
}
