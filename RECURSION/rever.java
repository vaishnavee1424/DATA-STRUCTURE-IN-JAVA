public class rever {
   static int sum=0;
   static void reverse(int n){
        if(n==0){
           return ;
        }
     int rem=n%10;
     sum=sum*10+rem;
    reverse(n/10); 
   }  
public static void main(String[] args) {

 System.out.println( rev2(1234));}

 
static int rev2(int n){
   //sometimes you might need some addtional variables in the argument 
   // in that case ,make another function
   int digits=(int)(Math.log10(n)+1);
   return helper(n,digits);
}

private static int helper(int n,int digits){
   if(n%10==n){
      return n;
   }
   int rem=n%10;
   return rem* (int)(Math.pow(10,digits-1))+ helper(n/10,digits-1);
}
}