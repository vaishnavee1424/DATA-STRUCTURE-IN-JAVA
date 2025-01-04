public class swap {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        //swap numbers code;
        // int temp=a;
        // a=b;
        // b=temp;

        swap(a,b);
        System.out.println(a+" "+ b);
        String name="vaishnavi Prajapati";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String naame){
        naame="khushi";// creating an object.
        // those variable which is declared , we can only access them in that not outside that function
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }


}
