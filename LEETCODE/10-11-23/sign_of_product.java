class Solution {
    public int arraySign(int[] nums) {
        int product=0;
        for(int i=1;i<nums.length;i++){
               product=nums[i]*nums[i-1];
               if(product>=1){
                   return 1;}
               else{
                 return -1;
                   }
               
            }
          return 0;
        }
    
    }
