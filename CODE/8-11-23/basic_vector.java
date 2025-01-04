import java.util.*;  
public class basic_vector {  
       public static void main(String args[]) {  
          // CREATNG A VECTOR
          Vector<String> vec =new Vector<String>();
         
          //Adding elements using add() method of List  
          vec.add("Chocolates");
          vec.add("Ice cream");  
          vec.add("Cold coffe");  
          vec.add("Shake");  
          vec.add("cold_Drink");  
          //Adding elements using addElement() method of Vector  
          vec.addElement("rasgulla")  ;
          vec.addElement("barfi");  
          vec.addElement("Moti_chur_ke _laddo");  
            
          System.out.println("Sweet Dishes are: "+vec);  
       }  
}  