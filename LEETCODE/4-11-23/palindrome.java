

class plaindrome{
    public boolean isPalindrome(int x) {
      int reverse=0;
      int temp, last;
       temp=x;
       while(x>0){
               
   last=x%10;  //getting remainder  
   reverse=(reverse*10)+last;    
   x=x/10;    
    
       }
        if(temp==reverse)    
   return true;
  else    
    return false;  
}  
    
}
