
import java.util.*;
// it is not correct because a number should be multilied by it's selfs number.
// correct it by tommmorow!!
 public class arms_strong{
    public static void main(String[]args){
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int given_num=sc.nextInt();
         System.out.println("how many digit it contains:");
          int digits=sc.nextInt();
    //   int count=0;
        int sum=0;
        int arm_no=given_num;
        while(given_num!=0){
           int remain= given_num%10;
            //  System.out.println("first remainder"+cube);
            // count++;
           sum+=Math.pow(remain,digits);
            //  System.out.println("cube of remainder and addition"+sum);
           given_num=given_num/10;
            //   System.out.println("division of the given number"+given_num);
    
        }
        // System.out.println( " how many digits it contains:"+count);
       if(sum==arm_no){
           System.out.println("Yup!!" +arm_no+ " is an Armstrong number");
       }
       else{
           System.out.println("Nope" +arm_no+ " is not an Armstrong number");
       }
    
    }
    
}