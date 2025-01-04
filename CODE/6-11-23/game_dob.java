import java.util.*;
public class game_dob {
    public static void main(String[]args){
         Scanner sc =new Scanner(System.in){ 
            int a=31052004;
            int num;
            int sum=0;
           while(sum<10){
            num=a%10;
            sum=sum+num;
           }
           if(sum%2==0){
           System.out.println("bad");
           }
            else{
                System.out.println(" good");
             }

         }
    }
}
// abhi nhi hua hai.
// 31+05+2004;
//3+1+5+2+0+0+4;
// if sum==odd;
// bewakoof
// sum==even;
// shabash mere baccha;
