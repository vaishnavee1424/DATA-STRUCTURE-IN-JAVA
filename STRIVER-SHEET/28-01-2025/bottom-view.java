//User function Template for Java
// Approach:
// 1) made class pair for queue data structure 
// 2) declaring queue and treemap(for sorted order ).
// 3) We will use level order traversal for calculating horiontal distance .
// 4) Mapping for storing first appear elements from bottom
// pair curr will store top element and whatever be the condition just update the 
// the mapping value and at the end return ans


class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
      Queue <Pair> Q=new ArrayDeque<Pair>();
      Map<Integer,Integer> map=new TreeMap<>();
      Q.add(new Pair(0,root));
      while(!Q.isEmpty()){
         Pair cur=Q.poll();
        
         map.put(cur.hd,cur.node.data); //dust
          
         if(cur.node.left!=null){
             Q.add(new Pair(cur.hd-1,cur.node.left));
         }
          
          if(cur.node.right!=null){
             Q.add(new Pair(cur.hd+1,cur.node.right));
         }
          
          
      }
      
    
    ArrayList<Integer> ans =new ArrayList<>();
     for(Map.Entry<Integer ,Integer> entry : map.entrySet()){
          ans.add(entry.getValue());
      }//dust
      
       return ans;
    
    }
   static class Pair{
        int hd;
        Node node;
        public Pair(int hd,Node node){
            this.node=node;
            this.hd=hd;
        }
    }
}