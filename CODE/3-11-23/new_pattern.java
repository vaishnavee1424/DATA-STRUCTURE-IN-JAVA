import java.util.*;
class new_pattern{
    public static void main(String[]args){
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
             
              
              if(i%2!=0&&j%2!=0)
              {
                  if((i==1||i==7)&&(j==3||j==5)){
                      System.out.print("  ");
                  }
                  
                  else{
                        System.out.print("*"+" ");
                
                  }
              }
               System.out.print("  ");
              
               if(i%2==0&&j%2==0){
                    if((i==2||i==6)&&(j==4)){
                      System.out.print("  ");
                  }
                   else{
                        System.out.print("*"+" ");
                
                  }
                   
               }
              
                  
                
               
                
            }
             System.out.println("");
                
        }
    }
}