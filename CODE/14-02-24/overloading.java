public class overloading {
    // it symphasize the concept that we can have a class of same name but make sure its parameter should be different!!
    check its code !!!
    we can also use this is varArgs
        

    public class Overloading {
        public static void main(String[] args) {
    //        fun(67);
    //        fun("Kunal Kushwaha");
            int ans = sum(3, 4, 78);
            System.out.println(ans);
        }
    
        static int sum(int a, int b) {
            return a + b;
        }
    
        static int sum(int a, int b, int c) {
            return a + b + c;
        }
    
        static void fun(int a) {
            System.out.println("first one");
            System.out.println(a);
        }
    
        static void fun(String name) {
            System.out.println("Second one");
            System.out.println(name);
        }
    }



}
