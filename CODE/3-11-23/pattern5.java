// 1
// 12
// 123
// 1234
// 12345
// public class pattern5 {
//     public static void main(String[]args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                System.out.print((j));
//             }
//             System.out.println("");
//         }
//     }
// }

// output
// 1
// 12
// 123
// 1234
// 12345



// next question

// public class pattern5 {
//     public static void main(String[]args){
//         for(int i=5;i>=1;i--){
//             for(int j=i;j>=1;j--){
//                System.out.print((j));
//             }
//             System.out.println("");
//         }
//     }
// }

// output
// 54321
// 4321
// 321
// 21
// 1



// 1 2 3 4 5   
// 1 2 3 4    
// 1 2 3       
// 1 2 
// 1

// public class pattern5 {
//     public static void main(String[] args) {
//         int n = 5; // You can change this to adjust the number of rows
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i + 1; j++) {
//                 System.out.print(j);
//                 if (j < n - i + 1) {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
