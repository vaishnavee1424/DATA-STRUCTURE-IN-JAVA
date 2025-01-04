import java.util.*;
public class element {
    public static void main(String[] args) {
        int[]array={7,8,34,65,24,56,75};
        int num=54;
        boolean ans=  linear_search(array, num);
        System.out.println(ans);

      int index=  linear_search3(array, num);
         System.out.println("index will be"+index);
    }
    //search an element an return true if found else false.
    static boolean linear_search(int []arr,int num){
        if (arr.length == 0) {
            return false;
        }
        for(int element:arr){
            if(element==num){
                return true;
              }
        }
        return false ;
    }
     // search the element and return the num
    static int linear_search2(int[]arr,int num){
        if (arr.length == 0) {
            return -1;
        }
        for(int element:arr){
            if(element==num){
                return num;
              }
        }
        return Integer.MAX_VALUE;
    }
     // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linear_search3(int[]arr,int num){
        if (arr.length == 0) {
            return -1;
        }
         for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return i;
            }
         }
        // for(int element:arr){
        //     if(element==num){
        //         return index;
        //       }
              
        // }
        return Integer.MAX_VALUE;
        // just for not having confusion purpose because -1 may not be defined as index but it may be as a
        //element so Integer.MAX_VALUE this will give only a larger value.
    }
}

        
  
    
 



















