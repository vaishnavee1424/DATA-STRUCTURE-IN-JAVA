// searching in a 2 dimensional array.
import java.util.Arrays;
public class richest_wealth {
    public static void main(String[] args) {
        int [][] arr={{2,4,5,8,3},
                 {9,5,3,4,5},
                 {6,8,9,5,3}
        };
        
System.out.println("maximum alue that 2d array contains is that:"+Maximum(arr));
    }
static int Maximum(int[][]arr){
 int  target=0;
 int sum=0;
    for(int row=0;row<arr.length;row++){
       for(int col=0;col<arr.length;col++){
        sum+=arr[row][col];
          if(sum>target){
            System.out.println(sum);
            target=sum;
          }
      }
    }
    return target;
  }
}
// je toh ans galat de rao hai.