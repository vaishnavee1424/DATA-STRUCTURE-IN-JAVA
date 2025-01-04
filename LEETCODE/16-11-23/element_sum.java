class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum=0;
        int difference=0;
        int digits=0;
    for(int i=0;i<nums.length;i++){
        element_sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
        while(nums[i]!=0){
            
            digits = digits + nums[i] % 10;
            nums[i]= nums[i] / 10;
        
        }
      difference=element_sum-digits;
    }
    return difference;
}
}