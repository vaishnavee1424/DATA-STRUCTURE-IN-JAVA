// https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
// Approach: firstly we will collect all the multiples of both Long A and Long B by applying for loop 
// then we will store multiples of A & B in two Arrays respectively 
// now we will traverse from the beginning if  same elements are found in
// both these arrays then we will multiply them together and return as GCD and non common elements also get multiply with each other and return  as Lcm .
//  What do you think how it is?? and also do u have any another approach 



// euclidean method ....
class gcd {
    static Long[] lcmAndGcd(Long A , Long B) {
         
         int[]arrayA=new int[100];
         int []arrayB=new int[100];

            int []result=new int [100];
         for(int i=2;i<A;i++){
            if(A%i==0){
                arrayA[i]=i;
            }
         }
         // isme 2,7 store hoga
         for(int i=2;i<B;i++){
            if(B%i==0){
                arrayB[i]=i;
            }
         }
         // isme 2,2,2,hoga

      for(int i=0;i<arrayA.length;i++){
        for(int j=0;j<arrayB.length;j++){
            if(arrayA[i]==arrayB[j]){
              result[i]=arrayA[i];
            }
        }
      }

         


         
    }
    public static void main(String[] args) {
        System.out.println(lcmAndGcd(14,8));
    }
};