
// Implementing Selection  sort again
import java.util.Arrays;
class Selection_sort{
  
    public static void main (String[] args) {
    int [] nums= {3,22,5,6,7,8};
    Selection_sorting(nums);
    System.out.println(Arrays.toString(nums));
    // In java we do'nt print the array directly by itself 
    // Firstly we had to convert Arrays to String then 
    
    }
    // Function for selection sort 
    public static void Selection_sorting (int [] nums){
        
        for(int i=0;i<nums.length-1;i++){
            int most_minimum=i;
              
            for(int j=i+1;j<nums.length;j++){
             if(nums[most_minimum]>nums[j]){
               
                most_minimum=j;
             }

            }
            // we got the most_minimum element ;
            if(most_minimum!=i){
                
             swap(nums,i, most_minimum);
            }
        }
  
    }

    // Swapping function of indices 
    static void swap(int [] nums,int i , int most_minimum){
      int temp=nums[i];
      nums[i]=nums[most_minimum];
      nums[most_minimum]=temp;

    }
}