
import java.util.ArrayList;
import java.util.Arrays;
public class Merge_sort {
    
    public static void main(String[] args){
     int [] arr={1,2,4,1,2};
     int low=0;
     int high =arr.length;
     merge_sort(arr, low, high);

     System.out.println(Arrays.toString(arr));

    }
    public static void merge_sort(int []arr,int low ,int high){
   if(low<=high)return;
       
      int mid= (low+high)/2;
   
      merge_sort( arr, low , mid);
      merge_sort(arr, mid+1,high);
      merge(arr,low,mid,high);
    }
    public static void merge(int [] arr, int  low, int  mid ,int high){
      ArrayList <Integer> temp = new ArrayList<>();
      // there will be a left and right pointer from comapring low to mid and mid+1 to high;
      int left=low;
      int right=mid+1;
      while(left<=mid && right<=high){
        if(arr[left]<=arr[right]){
            temp.add(arr[left]);
            left++;
        }
        else {
            temp.add(arr[right]);
            right++;
        }

      }
      while(left<=mid){
        temp.add(arr[left]);
        left++;
      }
      while(right<=high){
        temp.add(arr[right]);
        right++;
      }
      // for loop arr mai temp ke elements dalane ke liye;
      for(int i=low ;i<high;i++){
        // arr[i]=temp[i-low];

         arr[i]=temp.get(i-low);
        
      }
    }
   
}
