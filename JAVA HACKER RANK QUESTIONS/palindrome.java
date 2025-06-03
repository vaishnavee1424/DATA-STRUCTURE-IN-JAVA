import java.util.*;
import java.io.*;
public class palindrome{
    public static void main(String[]args){
         Scanner sc =new Scanner(System.in);
                 String input=sc.nextLine();
                 
                String output = "";
            
                for (int i = input.length() - 1; i >= 0; i--) {
                    output = output + input.charAt(i);
                }
                
               if(output.equals(input))
                System.out.println("Yes");

               
               else
                System.out.println("No");
               
        
         
    }
}
