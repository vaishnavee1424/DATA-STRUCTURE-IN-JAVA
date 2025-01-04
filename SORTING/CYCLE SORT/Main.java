// package SORTING.New folder;
// when you have given range to 1 to n then try to solve this with cycle sort.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int []arr={3,1,5,2,4};
        cycle_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle_sort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
   
      static void swap(int []arr,int i,int correct){
         int temp=arr[i];
         arr[i]=arr[correct];
          arr[correct]=temp;
      }



}
