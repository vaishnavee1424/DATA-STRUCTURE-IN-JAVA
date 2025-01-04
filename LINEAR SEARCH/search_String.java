import java.util.*;
class search_string{
public static void main(String[]args){
      String a="wonderful";
      char b= 'p';
        System.out.println(String1(a,b));
        System.out.println(Arrays.toString(a.toCharArray()));
}
//Search in a string an return true or false according to that!!

static boolean String1(String s,char b){
       if(s.length()==0)return false;
       for(int i=0;i<s.length();i++){
        if( b==s.charAt(i)){
            return true;
        }
       }
       return false;
        }
        

        static boolean search2(String str, char target) {
          if (str.length() == 0) {
              return false;
          }
  
          for(char ch : str.toCharArray()) {
              if (ch == target) {
                  return true;
              }
          }
          return false;
      }
}





















