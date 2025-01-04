// package code.4-02-2024;

import java.util.Arrays;

public class code {
    public static void main(String[]args){
       
          int []array={-1,0,1,2,-1,-4};
          Arrays.sort(array);
          for(int i=2;i<array.length;i++){
                   int sum=array[i-2]+array[i-1]+array[i];
                    System.out.println(sum);
                }
            }
          }
    
