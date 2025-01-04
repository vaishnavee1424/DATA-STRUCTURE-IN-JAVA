
public class prime {
    public static void main(String[]args){
       
       int a=2; 
       int count=0;
       
       for(int i=2;i<a;i++){
        if(a%i==0){
            count++;
        }
       }
       if(count>0|| a==1){
         System.out.println("not a prime");
       }
       else{
        System.out.println("prime");
       }
    
    }}
     
    

