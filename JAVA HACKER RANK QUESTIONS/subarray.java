import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,sum=0,c=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum+=a[k];
                   
                }
                 if(sum<0)c++;
            }
        }
        System.out.print(c);
}

}


// this is my actual appproach for the. and finally after
//  facing too many error and failed test cases i switch to the answer.

// import java.io.*;
// import java.util.*;
// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n =sc.nextInt();
//         int sum=0;
//         int count=0;
//         int[]array=new int[n];
//           for(int i=0;i<array.length;i++){
//               if(sc.hasNextInt()){
//                   array[i]=sc.nextInt();
//               }
//           }
//         for( int i=0; i<array.length;i++){
//               if(array[i]<0){ 
//                   count++;
//               }
//           }
//               for( int i=0; i<array.length;i++){
//               sum=sum+array[i];
//               if(sum<0){ 
//                   count++;
//               }
//               }
          
//           for( int i=2; i<array.length;i++){
//               sum=array[i-2]+array[i-1]+array[i];
//               if(sum<0){ 
//                   count++;
//               }
//           }
          
//           for( int i=3; i<array.length;i++){
//               sum=array[i-3]+array[i-2]+array[i-1]+array[i];
//               if(sum<0){ 
//                   count++;
//               }
//           }
//            for( int i=4; i<array.length;i++){
//               sum=array[i-4]+array[i-3]+array[i-2]+array[i-1]+array[i];
//               if(sum<0){ 
//                   count++;
//               }
//           }
//      System.out.println(count);
//     }
// }
 

