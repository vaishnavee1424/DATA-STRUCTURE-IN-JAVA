import java.util.*;
import java.util.ArrayList.*;
public class ArrayList {
    public static void main(String[] args) {
        int []arr={2,3,5,7,4,8};
        int target=4;
        ArrayList<Integer> ans=findAllIndex(arr,4,0,new ArrayList<>());
        System.out.println(ans);    
    }
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list)
    }
}
// bhai kuch galat hai dekh lena!!
