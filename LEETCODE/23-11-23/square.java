
public class square {
       public static void main(String[]args) {
        int x=8;
        float n;
        int square=0;
        for(float i=0;i<x;i++){
            n=i*i;
            if(n==x){
                square=(int)(Math.round(i));
                System.out.println(square);
            }
        }
         System.out.println(square);
    }
}