public class remove_sorted {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int start = 0;
            for(int i = 1; i < nums.length; i++) {
                if(nums[i] !=nums[i-1]) {
                     nums[start++] = nums[i];
                }
               if( nums[i]==nums[i-1] ){
                     nums[start++] = nums[i];
               }
            
           
        }
         return start ;
        }
    }
    
}


//  nhi ho rhe yrr ab dimag nhi chal rha mera
