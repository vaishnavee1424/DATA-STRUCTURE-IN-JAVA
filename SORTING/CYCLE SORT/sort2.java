// FIND ALL THE DISAPPEARED IN THE ARRAY
import java.util.ArrayList;
import java.util.Arrays;
public class sort2 {
    public static void main(String[] args) {
        int []nums={4,3,2,7,8,2,3,1};
        Arrays.sort(nums);
        int ans=sort(nums);
        System.out.println(ans);
    } 
    static int sort(int[]nums){
        for(int i=1;i<=nums.length;i++){
            int index=i;
            if(index!=nums[i]){
                return index;
            }
            
        }
        return nums.length;
     }



}
