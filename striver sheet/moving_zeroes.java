


public class moving_zeroes {

    
    int n=nums.length;
int count=0;
for(int i=0;i<n;i++){
    if(nums[i]==0){
        count++;
    }
}

if(n>1){
    while(count>0){
int f=nums[0];
int s=nums[1];
for(int i=1;i<n;i++){
   if(nums[f]==0){
        swap(nums,f,s);
        f++;
        s++;
    }
    else if(nums[f]==0 && nums[s]==0){
        f++;
        s++;
    }
}
}
}
count--;
    }


static void swap(int []nums,int f,int s){
int temp=nums[f];
nums[f]=nums[s];
nums[s]=temp;
}
