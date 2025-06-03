// java string tokens
import java.util.*;// used for utility like scanner class
import java.io.*; //used for input /output operations
import java.math.*; // used for mathematical expressions
import java.text.*; // used for text and alphabets 
import java.util.regex.*; // used for regular expressions
public class Tokens {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String S = sc.nextLine();
         String[] words = S.split("[^a-zA-Z]"); // split is used to make separate each string
         int count = 0;
        
         for (int i=0; i<words.length; ++i) 
             if (words[i].length() > 0) 
                 count++;
             
         System.out.println(count);
        
         for (int i=0; i<words.length;++i)
             if (words[i].length() > 0)
                 System.out.println(words[i]);
    }
}