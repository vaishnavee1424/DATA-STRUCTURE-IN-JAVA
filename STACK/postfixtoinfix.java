// converting an post expression to it's  infix expression
//Approach: AB-DE +F*/ -> (A-B)/(D+E)*F
/* 1] traverse throught the expression itself
* 2] when its an operand st.push();
*3] else new string = '(' + t2 + operator + t1 +')'
* 4] again push it back to my stack of strings  
* till 4th steps will repeat until we reached to it's end 
*5] return my string 
* 6] remember stack should contain 
*/ 
import java.util.Stack;
class Solution {
    
    // postfit to infix funtion
    
    static String postfixtoinfix(String exp){
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
              
               String s2='(' + t2 + c + t1 + ')';
               st.push(s2);
            }
            
        }
        
        return st.pop();
    }
    
    
    
    
    // main funtion
    public static void main (String[] args){
        String exp="AB-DE+F*/";
        System.out.print(postfixtoinfix(exp));
    }
    
}