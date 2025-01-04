public class passingExample {
    public static void main(String[] args) {
        String chacha="Iron Man";
        greet(chacha);
    }
    static void greet(String chachi){
        System.out.println(chachi);
    }
    // chacha ka chachi se koi lena dena nhi hai , chacha ki value chachi adapt kar leti hai.
    // what is call by reference and call by value ??
    // java works only over call by value not for the reference!!.
    // copying of the value works here!!
}
