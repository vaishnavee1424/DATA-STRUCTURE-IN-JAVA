 import java .util.Arrays;
 public class missing {
    public static void main(String[]args) {
        int []nums={9,6,4,2,3,5,7,0,1};
        Arrays.sort(nums);
        int missing=0;
        for(int i=0;i<nums.length;i++){
            
            if(missing==nums[i]){
                missing=missing+1; 
            }
            else{
                System.out.println(missing);
            }
        }
       System.out.println(missing);
    }

}