class Solution {
    public int arraySign(int[] nums) {
        int product=1;
        
        for(int i=0;i<nums.length;i++){ 
                 if(nums[i]==0){
                return 0;
                   }
               if(nums[i]>=1){
                   nums[i]=1;}
                if(nums[i]<0){
                    nums[i]=-1;
                }
                 product=product*nums[i];
        }  
             
             if (product>=1){
                   return 1;}
                else{
                    return -1;
                }
        
    }

    }
