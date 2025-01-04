//          * 
//         ** 
//        *** 
//       **** 
//      ***** 
//    *******
// left handed pyramid
//   ways according to me of doing this
// 1] increment operator
// 2] decrement operator
// 3]columns wise

    
public class left_handed_pyramid{
    public static void main(String[]args){
        int a=5;
        for (int i = 1; i <= a; i++) {
            // Print spaces for indentation
            for (int j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }

            // Print asterisks for the pyramid
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
       }
}
                                                                                             
 
