/*Order Agnostic
 * it is the process of knowing that whether the array
 * is given in the ascending or desending order
 * 
 */
//check the code first!!
public class order_Agnostic {
    public static void main(String[] args) {
        int []array={-14,-3,0,3,7,12,34,54,64,75,86,95};
        int target=-14;
        int ans=binary_search(array,target);
        System.out.println(ans);
    }
    static int binary_search(int []arr,int target){
        
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
     
    //find the middle element
    int mid=(start+end)/2;
    /* if it doesn't work for large numbers use that:
    int mid =start(end-start)/2;
    */ 
    if(arr[mid]==target)return mid;
    if(isAsc){
        if(target<arr[mid]){
            end=mid-1;
    }
    else {
    start=mid+1;
    }
    }
    else{
        if(target>arr[mid]){
            end=mid-1;
    }
    else{
        start=mid+1;
    }
    }
  }
               
            
    return -1;
}
}
