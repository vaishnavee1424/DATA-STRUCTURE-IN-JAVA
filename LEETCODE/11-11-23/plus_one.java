
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4]

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 n
 
public class plus_one{
    public static void main(String[]args){

    }
}


// Input: digits = [1,2,3]
// Output: [1,2,4]

class Solution{
    public static void main(String []args){
        int r=0;
        int digits[]={1,2,3};
        for(int i=digits.length;i>0;i--){
            r=digits[i]+1;
            if(r==0){
                // digits[i-1]+1;
          }
         
      }
       for(int i=0;i<digits.length;i++){
              System.out.println(digits[i]);
          }
}
}