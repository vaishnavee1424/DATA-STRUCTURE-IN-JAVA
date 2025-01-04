// checking an array if it is sorted or not!!
// package Arrays;

public class sorted {
    public static void main(String[] args) {
        int []a={1,2,0,3,4,5,6};
        System.out.println(sorted(a,0));
    }
    static boolean sorted(int a[],int indices){
        if(indices==a.length-1){
            return true;
        }
       return a[indices]<a[indices+1] && sorted(a,indices+1);
       // it itself returning a boolean if the condition satifies it's true else false!!
       
    }
}
// hamne toh usko bataya nhi ki kaha pe hamko false return karna hai.