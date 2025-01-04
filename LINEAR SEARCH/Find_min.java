// Find minimum element int the array.
public class Find_min {
    public static void main(String[] args) {
        int[]array={78,8,34,65,24,56,5};
       
        int mini=  linear_search3(array);
        System.out.println("minimum element will be"+mini);
    }
    static int linear_search3(int[]arr){
        if (arr.length == 0) {
            return -1;
        }
        int mini=arr[0];
         for(int i=1;i<arr.length;i++){
            if(mini>arr[i]){
                mini=arr[i];
                // return mini;   
                // why we are not writing mini over here because beacuse it  can't iterate to the last because 
                // when it find first mini it will return it there.       

            }
            
         }
        // for(int element:arr){
        //     if(element==num){
        //         return index;
        //       }
              
        // }
        return mini;
        // just for not having confusion purpose because -1 may not be defined as index but it may be as a
        //element so Integer.MAX_VALUE this will give only a larger value.
    }
}
