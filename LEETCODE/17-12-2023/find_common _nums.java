class solution{
public static void main(String[]args){

}
}
class Main {
    public static void main (String []args) {
        int j=0;
        int []nums1={4,3,2,3,1};
        int []nums2={2,2,5,2,3,6};
        int n=nums1.length;
        int nums[] = new int[n+1];  
      for(int i=0;i<nums1.length;i++){
          for( j=0;j<nums2.length;j++){
              if(nums1[i]==nums[j]){
                  
                 nums[i] =nums1[i];
                  System.out.println(nums[i]);
              }
          }
      }
    }
}