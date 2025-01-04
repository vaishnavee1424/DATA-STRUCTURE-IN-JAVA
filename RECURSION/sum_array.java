// Sum triangle from array
//gfg question!!
//Input : A = {1, 2, 3, 4, 5}
// Output : [48]
// [20, 28] 
// [8, 12, 16] 
// [3, 5, 7, 9] 
// [1, 2, 3, 4, 5] 
//https://www.geeksforgeeks.org/sum-triangle-from-array/
public class sum_array{
    public static void main(String[] args) {
        
    }
    public void sum(int []a){
        if(a.length<1){
            return ;
        }
        int []temp=new int[a.length];
        for(int i=1;i<a.length-1;i++){
            int x=a[i]+a[i+1];
            temp[i]=x;
           
        }
    }
    
}