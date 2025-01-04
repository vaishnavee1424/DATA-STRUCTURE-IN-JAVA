import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(3,5,6,7,8,3,42);
        multiple(3,5,"kunal");
    }

    static void multiple(int  ,int ,String...v ){
        // check this error 
    }

    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
    // in place of int we can put char string, boolean etc any thing what we want to put in that!!.
}
/* we can't have a pair in that int string int arguments ## String should always be at the last.

**/ 