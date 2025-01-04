// to solve pattern question first you have to 
//1) Observe the relationship between the pattern and spaces 
//2)stablish an equation between ith row and jth column
// code it!!
public class main {
    public static void main(String[] args) {
          pyramid(8);
        // righthalfpyramid(6);
        // pattern5(5);

        //         rectangle(6);
        // // pattern2(5);
        // right_anglednum(6);
        // right_angledtriangle(7);
    }
    static void rectangle(int row){
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void right_angledtriangle(int row){
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void right_anglednum(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    // how to print this pattern itself
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *


    static void pattern5(int n){
        // first i have to print the right angled triangle then i have to look for the another 
        // triangle which is in downward position!! 
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
             System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    //print this pattern 
//      *
//     **
//    ***
//   ****
//  *****
    static void righthalfpyramid(int n)
{
    

    for(int i=0;i<n;i++){
        // spaces
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        // stars
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
//       *
//      ***
//     *****
//    *******
//   *********



static void pyramid(int n)
{
    for(int i=0;i<n/2+1;i++){
        // spaces
        for(int j=0;j<n-i/2;j++){
            System.out.print(" ");
        }
        // stars
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }

    for(int i=n+1/2;i<n;i++){
        // spaces
        for(int j=i+1/2;j<n-i/2;j++){
            System.out.print("");
        }
        // stars
        for(int j=i+1/2 ;j<i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}





}






// *
// **
// ***
// ****
// *****


















//question number 7
    //  *****
    //   ****
    //    ***
    //     **
    //      *



  