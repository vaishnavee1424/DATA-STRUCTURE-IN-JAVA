import java.util.*;
public class string_fun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.next();
        String ans=message1(name);
        System.out.println(ans);
        // message();
        // String sentence=text();
        // System.out.println(sentence);
    }
    static String message1(String name){
           String b="hello"+"  "+ name;
        return  b;
    }
    static int sum3(int a, int b){
        int sum=a+b;
        return sum;
    }
    static void message(){
        System.out.println("hey!! how you doing??");
    }
    static String text(){
        String texted="hey where do you live!!";
         return texted;
    }
    
    //SYNTAX 
    /* 
    access modifiers(will be explained in )return_type name(arguments){
     //body
     return statement;
    }
     */
    //when you don't want to written anything you wrote void only.
}

