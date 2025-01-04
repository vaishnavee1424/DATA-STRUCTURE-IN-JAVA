import java.util.*;
public class Main {
    // public static void main(String[] args) {
    //  int[]numbers = {2,7,11,15};
    //  int target = 9;
    //     for(int i=0;i<1;i++){
    //         int sum=0;
    //         for(int j=1;j<numbers.length;j++){
    //             System.out.println(numbers[j]);
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an element that you want me to search:");
        int n=sc.nextInt();
        int found=0;
        int []array={98,7,12,35,14,54,66,33};
        for(int i=0;i<array.length;i++){
            if(n==array[i]){
                found++;
            }
        }
        if(found>0)
            System.out.println("element found:"+n);
        else
            System.out.println("not found:");
    }
}
