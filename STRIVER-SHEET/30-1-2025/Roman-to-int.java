// Approach :
// 1) Decreasing loop from back to front in the string and 
// 2)  Set the priority function we will us for all the character from I to M and if there would be 
// 3) Traverse until you get a higher orderr charceter then break and 
// 4) Calculate /add then if all character has same priority add them
// 5)  If higher lesser priority comes then minus it .
// 6) then again to the same until the loops end 
// 7) at last return .
// complexity :
// traverse  O(n)+ inner traverse O(n);
// complexity will be o(n2).


class Solution {
    public  static int romanToInt(String s) {
        int result=0;
        for(int i=s.length()-1;i>=0;i--){
           char currchar=s.charAt(i);
            int currValue=value(currchar);
            if( i>0 && value(s.charAt(i-1))<currValue){
            result+=currValue-value(s.charAt(i-1));
               i--;
            }
            else{
                result+=currValue;
            }
        }
return result;

    }
    static int value(char ch){
        if(ch=='I')return 1;
        if(ch=='V')return 5;
        if(ch=='X')return 10;
        if(ch=='L')return 50;
        if(ch=='C')return 100;
        if(ch=='D')return 500;
        if(ch=='M')return 1000;
        return -1;

    }
    public static void main(String[]args){
        System.out.println(romanToInt("MCMXCIV"));
        
        
    }
}