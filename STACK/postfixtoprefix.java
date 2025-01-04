// converting an postfix expression to it's prefix  expression
//Approach: AB-DE+F*/ -> /-AB*+DEF
/* 1] traverse throught the expression
* 2] when its an operand st.push();
*3] else new string =  operator + t2+ t1
* 4] again push it back to my stack of strings  
*    till 4th steps will repeat until we reached to it's end 
*5] return my string 
* 6] remember stack should contain 
*/ 
import java.util.Stack;
class Solution {
    
    // prefix to infix funtion
    
    static String postfixtoprefix(String exp){
        Stack <String> st= new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c =exp.charAt(i);
            String s1=Character.toString(c);
            if(Character.isLetterOrDigit(c)){
                st.push(s1);
            }
            else{
               String t1=st.pop();
              
               String t2=st.pop();
              
               String s2= c + t2 + t1 ;
               st.push(s2);
            }
            
        }
        
        return st.pop();
    }
    
    
    
    
    // main funtion
    public static void main (String[] args){
        String exp="AB-DE+F*/";
        System.out.print(postfixtoprefix(exp));
    }
    
}

// same as prefix to post just flip the loop and t1 + t2 + c is used
