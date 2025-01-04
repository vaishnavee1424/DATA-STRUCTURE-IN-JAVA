import java.util.Scanner;
import java.io.*;
{   
    public class isprime{
        public static void main(String []args){
            Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
         boolean isprime(n){
            for(let i=2;i<n;++i){
                if(n%2==0){
                    return false;
                }
            }
            return true;
         }
        }
    } 
}


