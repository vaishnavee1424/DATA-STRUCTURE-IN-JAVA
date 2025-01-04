//Find Missing And Repeating element in array

public class repeat_missing
 {
   
    public static void main(String[]args){
        int []array={0,3,4,2,3};
      

               int repeat=0;
       for(int i=0;i<array.length;i++){
           for(int j=i+1;j<array.length;j++){
               if(array[i]==array[j]&&i!=j){
                   System.out.print(array[j]+ " ");
                  repeat=array[j]; 
                }  
             
           }
       }
       
       }
    //    for(int i=0;i<array.length;i++){
    //        for(int j=i;j<array.length;j++){
    //         if(repeat>array[i]);
           }
    

//  isme dikkat aa rhi hai yrr
// to find the missing element lets sort thr array first then find it.
// array ={0,2,3,3,4}
// now we will find the highest value array and compare 4 for other that
// ek loop lagayenge jisme 4 se ek kamm hote hue sab element ho agd nhi toh returrn that value;