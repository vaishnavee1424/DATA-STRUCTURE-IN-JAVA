// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
// Example 2:
// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].

public class merged_array {
    public static void main(String[]args){
            int[] nums1={1,2,3,0,0,0};
            int[] nums2={2,5,6};
            for(int i=0;i<nums1.length;i++){
                for( i=0;i<nums2.length;i++){
                    if(nums1[i]<nums2[i] ){
                        nums1[i]=nums2[i];
                        System.out.println(nums1[i]);
            }
                    }
                }
                
    }
}
