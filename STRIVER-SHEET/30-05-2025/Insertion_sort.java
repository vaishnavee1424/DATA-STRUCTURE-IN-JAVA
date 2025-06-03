
import java.util.Arrays;

// package STRIVER-SHEET.30-05-2025;
// Insertion sort will check the correct postion of the element 
// by comparing it to the previous one if it is less then swap else it is at correct pos


///13,46,24,52,20,9
//13
// 13,46
// 13,(46>24) swap
// 13, 24, 46 (13<24) no swap
// 13,24,46,52
//13,24,46,(52>20) swap until no swap condition occur means 20 will be postioned as its correct situation 

//13,20.24.46,(52>9) swap until no swap condition occur means 20 will be postioned as its correct situation 

// Final output : 9,13,20,24,46,52;

public class Insertion_sort {
    public static void main(String[] args) {
        int [] nums={13,46,24,52,20,9};
        Insertion_sorting(nums);

        System.out.println(Arrays.toString(nums));
    }
    public static void Insertion_sorting(int[] nums ){
    for(int i=1;i<nums.length;i++){
        if(nums[i]<nums[i-1]){
    for(int j=i; j>=0 ;j--){
        swap( nums, i,i-1);
        }
        }
    }
    }
    static void swap(int [] nums , int small , int large){
     int temp=nums[small];
     nums[small]=nums[large];
     nums[large]=temp;
    }
}
