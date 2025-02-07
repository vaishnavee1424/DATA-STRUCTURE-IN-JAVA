class Substring-with-K-Distinct {
    int countSubstr(String s, int k) {
        //  what I believe is that first count the different chars in the string and if it is less then the k return 0
        //  Step 2 by using nested loop generate all the string and  at the  same time count if it same num of char as k's value
        //  then count ++ else move to next string ; but I dont now how to do that 
         Set <Character> uniquechar= new HashSet<>();
         for(char c:s.toCharArray()){
             uniquechar.add(c);
         }
         if(k>uniquechar.size())return 0;
         
         
         
          int count=0;
          for(int i=0;i<s.length();i++){
              for(int j=i+1;j<=s.length();j++){
                String substr=  s.substring(i,j);
                 
            Set <Character> countuniquechar= new HashSet<>();
             for(char c:substr.toCharArray()){
                countuniquechar.add(c);
             }
               if(k==countuniquechar.size()) count++;
              }
             
              
          }
         
         return count;
        
         
    }
}
// GOT TLE ERROR 
// question link:https://www.geeksforgeeks.org/problems/count-number-of-substrings4528/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-number-of-substrings