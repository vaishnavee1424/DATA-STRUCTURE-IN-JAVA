public class sqrt {
     float n;
        int square=0;
        for(float i=0;i<x;i++){
            n=i*i;
            if(n==x){

                square=(int)(Math.round(i));
                return square;
            }
        }
          return square;
}


// nhi aaya yrr kuch bhi smajh mai meko..


class Solution {
    public int mySqrt(int x) {
        if (x <= 1) return x;
long i = 1;
long sq = i * i;
while (x >= sq) {
	i++;
	sq = i * i;
}
return (int) (i - 1);
       
    }
}
mera kyu nhi huaa yahi kyu huaa
