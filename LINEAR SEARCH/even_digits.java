// leetcode 1295 question
 class even_digits {
    
    public static void main(String[] args) {
      
        int[]array={12,345,2,6,7896};
        int num=even_num(array);
        System.out.println(num);
    }
    static int even_num(int []arr){
        int count=0;
        int ans=0;
  for(int i=0;i<arr.length;i++){
             int n=arr[i];
    while(n>0){
      
         count++;
        n/=10;
    }
    if(count%2==0){
        ans =ans+1;
    }
  }
  return ans;
    }

}
//it is incomplete do that first
