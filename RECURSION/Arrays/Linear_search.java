// Searching an element linearly in the array itself!!

public class Linear_search {
public static void main(String[] args) {
    int []A={1,2,5,8,9};
    int target=9;
    System.out.println(sorted( A,0,9));
    System.out.println(findIndex( A,0,9));
    System.out.println( findIndexLast( A,0,9));

}   
static boolean sorted(int A[],int indices,int target){
        if(indices==A.length){
            return false;
        }
       return A[indices]==target ||sorted(A,indices+1,target);
       // it itself returning a boolean if the condition satifies it's true else false!!
       
    }
    
    static int findIndex(int []A,int indices,int target){
        if(indices==A.length){
            return -1;
        }
        if(A[indices]==target){
            return indices ;
        }
        return findIndex(A,indices+1,target);
    }
    static int findIndexLast(int[] A, int indices ,int target) {
        if (indices == A.length) {
            return -1;
        }
        if (A[indices] == target) {
            return indices;
        } else {
            return findIndexLast(A, indices-1,target);
        }
    }
}
