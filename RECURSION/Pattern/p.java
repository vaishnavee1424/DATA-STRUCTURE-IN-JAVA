//  * * * *
//  * * *
//  * *
//  * 
// how I can draw this pattern as well via an iteractive approach!!
import java.util.*;
public class p {
    public static void main(String[] args) {
        // triangle(4,0);
         triangle2(4,0);
         int []arr={3,5,4,6,2,5,6};
         bubble(arr,arr.length-1,0);
         System.out.print(Arrays.toString(arr));
    //  for(int i=0;i<6;i++){
    //     for(int j=i;j<6;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println("");
    //  }   
    }

// public class p {
//     public static void main(String[] args) {
//      for(int i=0;i<6;i++){
//         for(int j=0;j<6-i;j++){
//             System.out.print("*");
//         }
//         System.out.println("");
//      }   
//     }
// }
// then start using an recursive approach
// public class p{
// public static void main(String[] args) {
//     // triangle(4,0);
//     triangle2(4,0);
// }
// static void triangle(int r,int c){
//  if(r==0){
//     return;
//  }
//  if(c<r){
//     triangle(r,c+1);
//     System.out.print("*");
//  }
//  else{
//     triangle(r-1,0);
//     System.out.println("");
//  }
// }

     static void triangle2(int r,int c){
    if(r==0){
        return;
    }
    if(c<r){
        System.out.print("*");
        triangle2(r,c+1);
    }
    else{
        System.out.println("");
        triangle2(r-1,0);
       
    }
     }
     // bubble sort through recursion 
          static void bubble(int [] arr, int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
           if(arr[c]>arr[c+1]){
            //do a swapping function
            int temp=arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
           }
           bubble(arr,r,c+1);
        }
        else{
                
            bubble(arr,r-1,0);
           
        }
         }
         // Selection Sort 
         


}