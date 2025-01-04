import java.util.*;
public class Min_Max{
     public static void main(String []args){

        int []array=new int[10];
        Scanner sc=new Scanner(System.in);
        // getting elements of array through this loop.
        for(int i=0;i<10;i++){
                    System.out.println("enter the element"+ (i+1));
            array[i]=sc.nextInt();
        }
        int min_element=array[0];        
        int max_element=array[0];
        for(int num:array){
           if(num>max_element){
            max_element=num;
           }
           if(num<max_element){
            min_element=num;
           }
        }
              System.out.println("Max_Element will be"+max_element);
              System.out.println("Min_Element will be"+min_element);
             
     }

      
}


