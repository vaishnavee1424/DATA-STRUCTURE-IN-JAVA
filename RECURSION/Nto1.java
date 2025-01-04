// this will print 54321
class Nto1{
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        // base condition is must!!
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
      
    }
    // debugging is necessary
}
// this will print 12345
class Nto1{
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        // base condition is must!!
        if(n==0){
            return;
        }
      
        fun(n-1);
        System.out.println(n);
    }
    // debugging is necessary
}
