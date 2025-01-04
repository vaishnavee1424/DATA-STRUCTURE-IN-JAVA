class concept{
    public static void main(String[] args) {
        int ans=fun(5);
        System.out.println(ans);
    }
    static int fun(int n){
        if(n==0){
            return 0;
        }
           return fun(n-1);
        //difference between n-- and --n because when_ever you're trying to decrement the number use --n bcz n-- call the number first then decrement vise versa!!
    }
}