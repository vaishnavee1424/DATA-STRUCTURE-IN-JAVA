
import java.util.Arrays;
// package STRIVER-SHEET.30-05-2025;
public class Bubble_sort {
    // Array[] = {13,46,24,52,20,9}
    public static void main  (String[]args){
     int [] nums={8,665,3543,3,656};
     Bubble_sort(nums);
     System.out.println(Arrays.toString(nums));
        }
    public static void Bubble_sort(int []nums){
     for(int i=0;i<nums.length-1;i++){
        for(int j=1;j<nums.length;j++){
            if(nums[j-1]>nums[j]){
                swap( nums,j-1, j);
            }
             System.out.println("Same i"  +Arrays.toString(nums));
            
        }
        System.out.println(Arrays.toString(nums));
     }
    }
    static void swap(int [] nums,int i, int j){
        int temp = nums[i];
         nums[i]=nums[j];
         nums[j]=temp;

    }
}

// Logic galat hai kal ek bar aur dekhna !!!