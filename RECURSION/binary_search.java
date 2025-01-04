// package RECURSION;
//output if element got find return index else 0;
import java.util.*;
public class binary_search {
    public static void main(String[]args){
        int []nums={3,6,5,8,9,3,2};
        Arrays.sort(nums);
        int target=3;
        int s=0;
        int e=nums.length;
        int ans=search(nums,target,s,e);
        System.out.println(ans);
    }
     static int search(int []nums,int target,int s,int e){
        // this is the base condition!!.
           if(s>e){
            return -1;
              }
         int mid=s+(e-s)/2;
         if(nums[mid]==target){
            return mid;
         }
         else if(nums[mid]>target){
           return search(nums,target,s,mid-1);
         }
         else{
            return search(nums,target,mid+1,e);
         }
        

    }

}
