class  two_sum {
    public static void main(String []args) { 
        int array[]=new int[5];
        int add=0;
        int []nums={3,2,4};
        int target=6;
        for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
              add=nums[i]+nums[j];
             
              if(add==target){
                 array[0]=i;
                  array[1]=j;
              
                 
              }

          }
        }
    System.out.print((array[0]));
     System.out.print((array[1]));
    }
    
   
}