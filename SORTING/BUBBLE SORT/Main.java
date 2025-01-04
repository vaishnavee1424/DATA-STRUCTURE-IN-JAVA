// package SORTING.BUBBLE SORT;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int []arr={5,4,2,3,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[]arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            swapped=false;
            //for each step,max item will come at the last respective index
            for(int j=1;j<arr.length-i;j++){
                //swap if the element is smaller then the previous one
                if(arr[j]<arr[j-1]){
                    //swap
                 int temp=arr[j];
                 arr[j]=arr[j-1];
                 arr[j-1]=temp;
                }
            }
            if(swapped==true){
                break;
            }

        }
      
    }

}
