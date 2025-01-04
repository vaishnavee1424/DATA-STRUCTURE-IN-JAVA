// converting an prefix expression to it's infix expression
//Approach: *+ PQ -MN -> (N-M) * (Q+P)
/* 1] traverse throught the expression but from last
* 2] when its an operand st.push();
*3] else new string = '(' + t1 + operator + t2 +')'
* 4] again push it back to my stack of strings  
*    till 4th steps will repeat until we reached to it's end 
*5] return my string 
* 6] remember stack should contain 
*/ 
import java.util.Stack;
class Solution {
    
    // prefix to infix funtion
    
    static String prefixtoinfix(String exp){
        Stack <String> st= new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char c =exp.charAt(i);
            String s1=Character.toString(c);
            if(Character.isLetterOrDigit(c)){
                st.push(s1);
            }
            else{
               String t1=st.pop();
              
               String t2=st.pop();
              
               String s2='(' + t1 + c + t2 + ')';
               st.push(s2);
            }
            
        }
        
        return st.pop();
    }
    
    
    
    
    // main funtion
    public static void main (String[] args){
        String exp="*+PQ-MN";
        System.out.print(prefixtoinfix(exp));
    }
    
}