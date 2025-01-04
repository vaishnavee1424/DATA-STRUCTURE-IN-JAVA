public class single_number{
    public static void main(String[]args){
        int []nums={1,2,2};
     int xor = 0;
        for(int i = 0;i<nums.length;i++)
        {
            xor = xor ^ nums[i];
            // what is this line saying as per its conditions
            // 
        }
        System.out.println(xor);
    }
       
}
 // int single_num=0;
        // if(nums.length==1){
        //     return nums[0];
        // }
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[i-1] ){
        //       single_num=nums[i];
               
        //     }
        // }
        // return single_num;
        //  this code is not giving the correct prediction as per it's conditions;
    

