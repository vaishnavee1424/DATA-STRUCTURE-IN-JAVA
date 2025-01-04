import java.util.Arrays;
public class sorted_search{
    public static void main(String[] args) {
        int [][] matrix={
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(matrix,37)));
    }
    // search for an targeted element in binary array!!.
  static int[] binarySearch(int [][] matrix,int row ,int cStart,int cEnd,int target){
    while(cStart<=cEnd){
     int mid=cStart + (cEnd-cStart)/2;
     if(matrix[row][mid]==target){
        return new int[]{row,mid};

     }
     if(matrix[row][mid]<target){
        cStart=mid+1;
     }
     else{
        cEnd=mid-1;
     }
    }
    return new int[]{-1,-1};
  }

  static int[] search(int[][] matrix ,int target){
    int rows=matrix.length;
    int col=matrix[0].length; // be cautious matrix may be empty
    if(rows==1){
        return binarySearch( matrix, 0, 0, col-1, target);
    }
    int rStart=0;
    int rEnd=rows-1;
    int cMid=col/2;
// run the loop till 2 rows are remaining
while(rStart<(rEnd-1)){
    //while this is true it will have more than  
    int mid=rStart+(rEnd=rStart)/2;
    if(matrix[mid][cMid]==target){
        return new int[]{mid,cMid};
    }
    if(matrix[mid][cMid]<target){
      rStart=mid;
    }
    else{
      rEnd=mid;
    }
    //now we will have two rows itself!!
    //check whether the target is in the cols of 2 rows or not!!
    if(matrix[rStart][cMid]==target){
        return new int[]{rStart,cMid};
    }
    if(matrix[rStart+1][cMid]==target){
        return new int[]{rStart+1,cMid};
    }
    //search in the first half
    if(target<=matrix[rStart][cMid-1]){
         return binarySearch(matrix,rStart,0,cMid-1,target);
    }
    //search in the 2nd half
    if(target>=matrix[rStart][cMid+1]){
        return binarySearch(matrix,rStart,cMid+1,col-1,target);
    }
     //search in the 3rd half
     if(target<=matrix[rStart+1][cMid-1]){
        return binarySearch(matrix,rStart,cMid+1,col-1,target);
     }
     //search in the 4th half
    
     else{
        return binarySearch(matrix,rStart+1,cMid+1,col-1,target);
     }

}
return new int[]{-1,-1};

  }
}