

public class reverse_array {
    public static void main(String[]args){
       int[]array = {9,8, 9,7, 9,5};
       int[] new_array = new int[6];
        for(int i=5;i>=0;i--){
           new_array[i]=array[i];
        System.out.print(new_array[i]+" ");
    }

        }
  }

// output
// array={9,8,9,7,9,5};
// new_array={5,9,7,9,8,9};