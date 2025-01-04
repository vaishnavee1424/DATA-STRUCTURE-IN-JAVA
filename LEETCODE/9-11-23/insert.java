public class insert {
    public int searchInsert(int[] nums, int target) {
        int show=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=target && nums[i]>target){
                show=i;

                return show;
            }
            if(nums[i]==target){
                return i;
            }
            
        }
    return show;
    }
{
    
}
// 2 case ho gye !!
