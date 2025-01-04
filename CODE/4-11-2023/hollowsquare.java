        //  hollow square pattern
        //  * * * * * * *  only i=1 and j=1 * print 
        //  *           *   {        
        //  *           *     empty spaces creates here!!
        //  *           *
        //  *           *                
        //  *           *             }
        //  * * * * * * * here i=7&j=7 * print
// import java.math.*;
public class hollowsquare{
    public static void main(String[]args){
        for(int i=1;i<=7;i++){
                for(int j=1;j<=7;j++){
                        // if(i==1||i==7 |j==1||j==7){
                        //         System.out.print("*");
                               
                        // }
                        //  System.out.print("");
                       if(i==1||i==7 ||j==1||j==7){
                          System.out.print("* ");
                       }
                       else{
                        System.out.print("  ");
                       }
                        
                }
                 System.out.println("");
        }
    }
}



