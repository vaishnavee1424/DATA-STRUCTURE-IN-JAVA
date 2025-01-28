//**  Horizontal-distance=Queue+Map
class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static  class Pair{
        int hd;
        Node node;
        public Pair(int hd, Node node){
            this.node=node;
            this.hd=hd;
        }
    } //dust {**did'nt understand}
    
    static ArrayList<Integer> topView(Node root) {
      
      Queue<Pair> Q=new ArrayDeque<Pair>();
      Map<Integer,Integer> map=new TreeMap<>();
      Q.add(new Pair(0,root));
      while(!Q.isEmpty()){
          Pair cur=Q.poll();//dust
          if(!map.containsKey(cur.hd)){
              map.put(cur.hd,cur.node.data); //dust
          }
          if(cur.node.left!=null){
              Q.add(new Pair(cur.hd-1,cur.node.left)); //cur.node.left//dust
          }
          if(cur.node.right!=null){
              Q.add(new Pair(cur.hd+1,cur.node.right));
          }
          
      }
      ArrayList<Integer> ans=new ArrayList<>();
      
      for(Map.Entry<Integer ,Integer> entry : map.entrySet()){
          ans.add(entry.getValue());
      }//dust
      
       return ans;
    }
  

}