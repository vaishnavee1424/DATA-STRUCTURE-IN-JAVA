 // we are trying to solve a question that is called Missing number.
 //Missing number ={3,0,1};
import java.util.*;
 class sort {

    public static void main(String[] args) {
       
        int []nums={0,1};
        Arrays.sort(nums);
        int ans=sort(nums);
        System.out.println(ans);
    }
     static int sort(int[]nums){
        for(int i=0;i<nums.length;i++){
            int index=i;
            if(index!=nums[i]){
                return index;
            }
            
        }
        return nums.length;
     }




}
