

public class comparison {
    public static void main(String[] args) {
     String a="khushi";
     String b= "khushi";
     System.out.println(a==b);   
    //  a->khushi
    //  b->khushi  same  pool with heap memory
    String name1=new String("khushi");
     String name2= new String("khushi");
     System.out.println(name1==name2);

     //giving false value because both refrence variable is pointing to diffrent khushi in the heap memory.
      System.out.println(name1.equals(name2));
    }
}


