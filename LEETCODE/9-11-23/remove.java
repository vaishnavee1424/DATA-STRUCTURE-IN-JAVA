public class remove {
    public static void main(String []args){
        int array[]={3,5,4,2,4};
        int new_array[]=new int [5];
        int remove_element=5;
        int j=0;
    for(int i=0;i<=array.length;i++){
       if (remove_element!=array[i]){
           new_array[j]=array[i];
           System.out.println(new_array[j]);
            j++;
        }
    }
    }
}
