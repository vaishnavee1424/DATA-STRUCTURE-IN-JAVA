// *
// *  *
// *  *   *
// *  *   *  *
// *  *   *  *  *
// *  *   *  *
// *  *   *
// *  *
// *



public class Intermixed_pyramid{
    public static void main(String[]args){
        int a=15;
        for(int i=0;i<=a;i++){
            for (int j=0;j<=i;j++){
               System.out.print("* ");

            }
            System.out.println("");
        }
        for(int i=a-1;i>=0;i--){
            for (int j=i;j>=0;j--){
               System.out.print("* ");

            }
            System.out.println("");
        }
    } 



}
