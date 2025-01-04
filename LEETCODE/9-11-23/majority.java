public class majority {
    
        public static void main(String []args) {
            int count=0;
            int value=0;
            int []nums={3,2,3};
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]&& i!=j){
                         count=nums[i];
                          value++;
                         if(value>nums.length/2){
                             
                         }
                    }
                }
            }
            System.out.print(count);
        }
    }

// class Solution {
//     public int majorityElement(int[] nums) {
//         int count=0;
//         int value=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j] ){
//                      count=nums[i];
//                       value++;
//                      if(value>nums.length/2){
//                      }
//                 }  
                
//             }
//         }
//      return count;
//     }
// }
// class Main {
//     public static void main(String []args) {
//         int count=0;
//         int value=0;
//         int []nums={3,2,3};
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]&& i!=j){
//                      count=nums[i];
//                       value++;
//                      if(value>nums.length/2){
                         
//                      }
//                 }
//             }
//         }
//         System.out.print(count);
//     }
// }
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int value=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] ){
                     count=nums[i];
                      value++;
                     if(value>nums.length/2){
                     }
                }  
                
            }
        }
     return count;
    }
}
