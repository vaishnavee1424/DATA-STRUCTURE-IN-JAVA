class SearchIn_Range{
//we are searching an element in a particular range and returning it's index position.
    public static void main(String[] args) {
        int[]array={7,8,34,65,24,56,75};
        int num=24;
        int index=  linear_search3(array, num,1,4);
         System.out.println("index will be: "+index);
    }
        static int linear_search3(int[]arr,int num,int start,int end){
            if (arr.length == 0) {
                return Integer.MAX_VALUE;
            }
             for(int i=start;i<=end;i++){
                if(num==arr[i]){
                    return i;
                }
             }
            // for(int element:arr){
            //     if(element==num){
            //         return index;
            //       }
                  
            // }
            return Integer.MAX_VALUE;
    }
}


