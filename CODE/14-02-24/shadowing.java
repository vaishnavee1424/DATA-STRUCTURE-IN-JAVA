public class shadowing {
    // shadowing means accessing the same variable with this class but got diffrent values over it
    static int x=65;//this x will be shadowed or hidden at line8
    public static void main(String[] args) {
       
      System.out.println(x);//65 will print
      int x;// declared here!! and class variable at line 4 shadowd by this
      x=45;
      System.out.println(x);//45
      fun();
        
    }
    static void fun(){
        System.out.println(x);
    }
}
