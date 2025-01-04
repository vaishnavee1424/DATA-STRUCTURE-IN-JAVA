// converting infix to prefix expressions
// Approach :
/* 1] make a function which reverse infix expression and also open and close braces will be reverse to each other
 * 2] convertion of infix expression to its prefix expression (same as infix expression to post fix expression) and avoid same precedence operator
 * 3] again reverse your ans  
 */
 
 // a+b*(c^d-e);  convert this into
 // +a*b-^cde
 import java.util.Stack;
 class infixtoprefix {
     // reverse function
     
     static String reverse(String exp){
     String reverse= new String("");
         for(int i=exp.length()-1;i>=0;i--){
             char c=exp.charAt(i);
             if(c=='('){
                 reverse+=')';
                 continue;
             }
             else if(c==')'){
                 reverse+='(';
                continue;
             }
             reverse+=c;
         }
         return reverse;
     }
     
   //  precedence function
   // in precedence order we have to consider them as a same precedence +-,*/ and 
   // how i will modify this precedence order so that it will shows me a result that this will look alike 
   
   
     // static int pre(char c){
     //     switch(c){
     //         case '+':
     //         case '-':
     //           return 1;
     //         case '*':
     //         case '/':
     //             return 2;
     //         case '^':
     //             return 3;
     //     }
     //     return -1;
     // }
     
     
     // may be this will work 
     static int pre(char c){
         if(c =='+' || c=='-') return 1;
         else if(c=='*' || c=='/') return 2;
         else if(c=='^') return 3;
         else return -1;
     }
     
     
     // infix to prefix function
     static String infixtoprefix(String exp){
         Stack<Character> stack=new Stack<>();
         String s="";
         String reverseString=reverse(exp);
         
         for(int i=0;i<reverseString.length();i++){
             char c =reverseString.charAt(i);
             
             // if my string is an character 
             if(Character.isLetterOrDigit(c)){
                 s+=c;
             }
             // if my string is an operator
             else if(c=='('){
                 stack.push(c);
             }
             
             // 
             else if(c==')'){
                 while(!stack.isEmpty() && stack.peek()!='('){
                     s+=stack.pop();
                 }
                 stack.pop();
             }
             
             // I have to change some of its preference order ifself
             
             else{
                 while(!stack.isEmpty() && pre(c)<=pre(stack.peek())){
                     s+=stack.pop();
                    
                 }
                 stack.push(c);
             }
             
             
         }
         // pop all operator from the stack


         while(!stack.isEmpty()){
                 if(stack.peek()=='('){
                 return "invalid expression";
                 }
                 s+=stack.pop();
             }
         return reverse(s);
         
     }
     
     // main class 
     
     public static void main (String[]args){
         
         String exp="a+b*(c^d-e)^(f+g*h)-i";
         System.out.print(infixtoprefix(exp));
         

     }
 }