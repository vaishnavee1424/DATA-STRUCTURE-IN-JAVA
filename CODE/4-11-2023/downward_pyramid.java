// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
public class downward_pyramid{
    public static void main(String[]args){
        int a=5;
        for (int i = a; i >= 1; i--) {
            // Print spaces for indentation
            for (int j = a-i; j >= 1; j--) {
                System.out.print("  ");
            }

            // Print asterisks for the pyramid
            for (int k = i; k >= 1; k--) {
                System.out.print("* ");
            }

            System.out.println();
        }
       }
}
                                                                                             
 
