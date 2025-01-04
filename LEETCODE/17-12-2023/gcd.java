// class solution{
// public int findGCD(int[] nums)) {
//                 int largest=nums[0];
//                 for(int i=0;i<nums.length;i++){
//                     if(largest<nums[i]){
//                         largest=nums[i];
//                     }
        
//                 }
//                 for(int i=0;i<numslength;i++){
//                     if(nums[i]!=largest){
//                           gcd=largest%nums[i];
//                           if(gcd==0){
//                               return nums[i];
//                           }
//                     }
//                     else{
//                         return 1;
//                     }
                   
//                 }
//             }
//         }

class gcd{
    public static void main (String []args) {
        int []nums={2,5,6,8,10};
        int largest=nums[0];
        int gcd=0;
        for(int i=0;i<nums.length;i++){
            if(largest<nums[i]){
                largest=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=largest){
                  gcd=largest%nums[i];
                 int store = nums[i];
                  if(gcd==0){
                      
                     System.out.println(store);
                  }
            }
            else{
                 System.out.println("1");
            }
        }
    }
}

// sahi hai lekin optimize karna padhega
