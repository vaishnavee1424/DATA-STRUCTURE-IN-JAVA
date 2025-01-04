// package BINARY SEARCH;
/* binary search always have a sorted array
why binary search??
Implemantation
*/
import java.util.*;
import java.util.Arrays.*;
public class Main {
    public static void main(String[] args) {
        int []array={43,64,25,78,89,23,47,19,48,82,29,57};
        // int []array={98,54,34,32,23,12,5,2};
    Arrays.sort(array);

        int target=19;
       int ans=binary_search(array,target);
       System.out.println(ans);

    }
    static int binary_search(int []arr,int target){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
//find the middle element
int mid=(start+end)/2;
/* if it doesn't work for large numbers use that:
int mid =start(end-start)/2;
*/ 
if(target<arr[mid]){
        end=mid-1;
}
else if(target>arr[mid]){
start=mid+1;
}
else{
    // you found this element;
    return mid;
}
    }
           
        
return -1;
    }

}
