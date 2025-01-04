// Homework Problems
// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
// do both question using Scratch Implementation #important.
// import java.util.*;
// class home_work{
//     public static void main(String[]args){
//        LinkedList<String> list =new  <String>LinkedList();
//         list.add("3");
//          list.add("2");
//           list.add("8");
//            list.add("3");
//             list.add("7");
//                list.add("5");
//                 list.add("1");
//                 System.out.println(list);
//                 System.out.println("the element 7  index will be "+list.indexOf("7"));
//     }
// }
import java.util.*;
class home_work{
    public static void main(String[]args){
        LinkedList <String> list =new <String> LinkedList();
        list.add("1");
        list.add("5");
        list.add("7");
        list.add("3");
        list.add("8");
        list.add("2");
        list.add("3");
        System.out.println(list);
        System.out.println(list.indexOf("7"));
    }
}
