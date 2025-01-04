// there are three ways in which you can find a duplicate element in an array and store it.
// Ist way is through loop
public class duplicate_element {
    public static void main(String[]args){
       int []array={3,2,1,2,4,5};
       
       for(int i=0;i<array.length;i++){
           for(int j=i+1;j<array.length;j++){
               if(array[i]==array[j]&&i!=j){
                    
                   System.out.print(array[j]+ " ");
                }
                // else{
                //      System.out.println("-1");
                //  }  
           }
       }
    }
}
// isme na ek dikkat hai woh yeh ki agr mai 
// array rkhti hu array={3,2,1,2,,4,5,3,3}
///output will be 3233 

