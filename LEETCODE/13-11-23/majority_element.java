


    class Solution {
        public int majorityElement(int[] nums) {
            int count=0;
            int value=0;
             if(nums.length==1){
                     return nums[0];
                 }
            for(int i=0;i<nums.length;i++){
                count=0;
                for(int j=1;j<nums.length;j++){
                        if(nums[i]==nums[j]&&i!=j){
                       count++;
                       value=nums[i];
                 }
                }
                 if(count+1>nums.length/2){
                     return value;
                 }
            }
            return value;
        }
    
    }

