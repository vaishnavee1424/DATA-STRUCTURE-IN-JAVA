// package SORTING.INSERTION SORT;
import java.util.*;
public class main {
    public static void main(String[] args) {
        int []arr={7,4,8,9,2,5};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion_sort(int[]arr){
        for(int i=0;i<arr.length-2;i++){
               for(int j=arr.length-1;j>0;j--){
                if(arr[i]>arr[j]){
                    swap(arr,i, j);
                }
                else{
                    break;
                }
               }
        }
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
