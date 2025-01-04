// searching in a 2 dimensional array.
import java.util.Arrays;
public class Search_2dArray {
    public static void main(String[] args) {
        int [][] arr={{2,4,56,8,3},
                 {9,5,3,4,5},
                 {6,8,96,5,3}
        };
        // int target=3;
        // int []ans=Searching(arr,target);
        // System.out.println(Arrays.toString(ans));
System.out.println("maximum alue that 2d array contains is that:"+Maximum(arr));
    }
    static int[] Searching(int[][]arr,int target){
      for(int row=0;row<=arr.length;row++){
         for(int col=0;col<=arr.length;col++){
            if(arr[row][col]==target){
                return new int []{row,col};
            }
            // new int [] we have to written this thing in the return portion because we cannot written it directly while doing this thing
            //but we don't have to create in at the time of initializing in the starting.
        }
      }
      return new int[]{-1,-1};
    }
// Look 3 has occured more than one time in the 2d array why it is not showing that index[0,5] as well 
static int Maximum(int[][]arr){
 int  target=arr[0][0];
    for(int row=0;row<arr.length;row++){
       for(int col=0;col<arr.length;col++){
          if(arr[row][col]>target){
            target=arr[row][col];
             
          }
          // new int [] we have to written this thing in the return portion because we cannot written it directly while doing this thing
          //but we don't have to create in at the time of initializing in the starting.
      }
    }
    return target;
  }
}