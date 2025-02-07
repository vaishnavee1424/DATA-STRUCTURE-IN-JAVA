// Approach:
  // 1)  traverse through the string s and store one element the
  // 2) kya mai sare substrings generate karke unko check karte jau ki woh palindrom hai ya hi 
  // example:
        // babad
        // b    a    b
        // ba   ab   ba
        // bab  aba  bad
        // baba abad  
        // babad
        // // check all the generated substring and if they passed the condition then replaced it with the previous one

        //  code :
        //  make nested loop to generate strings
        //  then make a separate function to check then substring is palindrome or not 
        //  if it is palindrom then string in result string then check another substring
        //  if another found of same len or larger then previous string then replace it with previous one .


        class Solution {
            public String longestPalindrome(String s) {
                String longest="";
                for(int i=0;i<s.length();i++){
                    for(int j=i;j<s.length();j++){
                        String sub=s.substring(i,j+1);
                        if(isPalindrome(sub)){
                           if(sub.length()>longest.length()){
                            longest=sub;
                           }
                        }
                }
                }
                return longest;
            }
            static boolean isPalindrome(String sub){
                int left=0;
                int right=sub.length()-1;
                while(left<right){
                    if(sub.charAt(left)!=sub.charAt(right))return false;
                    left++;
                    right--;
                }
                return true;
            }
        }
