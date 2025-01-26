
// Problem of the day will be solved here 
// same 6th january problem count subarrays but with sliding window approach
import java.util.*;
public class count_subarrays{
public static int solution(String s, int k){
        int ans=0;
        HashMap<Character,Integer> mapb=new HashMap<>();
        HashMap <Character,Integer> maps=new HashMap<>();
        int is=-1;
        int ib=-1;
        int j=1;
        while(true){
            boolean f1=false;
            boolean f2=false;
            boolean f3=false;
            while(ib<s.length()-1){
                f1=true;
            ib++;
            char ch=s.charAt(ib);
            mapb.put(ch,mapb.getOrDefault(ch,0)+1);
            if(mapb.size()==k+1){
                ib--;
                removeInMap(mapb,ch);
                break;
            }
            
            }
            while(is<ib){
                f2=true;
                is++;
                char ch=s.charAt(is);
                maps.put(ch,maps.getOrDefault(ch,0)+1);
                if(maps.size()==k){
                    removeInMap(maps,ch);
                    is--;
                    break;
                }

                
            }
            while(j<is){
                f3=true;
                if(mapb.size() == k && maps.size() == k-1){
                    ans+=ib-is;
                }
                j++;
                char ch=s.charAt(j);
                removeInMap(maps,ch);
                removeInMap(mapb,ch);
                if(maps.size()<k-1 || mapb.size()<k){
                    break;
                }
            }
            if(f1==false && f2==false && f3==false){
                break;
            }
        }
        return ans;
    }
    public static void removeInMap(HashMap<Character,Integer> map,char ch){
    if(map.get(ch)==1){
      map.remove(ch);
    }
    else{
        map.put(ch,map.get(ch)-1);
    }
    }
    public static void main(String[] args){
        
    }

    // private static int getOrDefault(char ch, int i) {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }
}
// Disclamer yeh bhi code galat hai abhi toh
