/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
       int h=height(root);
       ArrayList<ArrayList<Integer>> Tree=new ArrayList<>();
       for(int i=1;i<=h;i++){
           ArrayList<Integer> levelNode=new ArrayList<>();
           InnerNode(root,i,levelNode);
           Tree.add(levelNode);
       }
       return Tree;
    }
    // func to get all the node values 
    static void InnerNode(Node root,int level , ArrayList<Integer> levelNode){
        if(root==null)return;
        if(level==1){
            levelNode.add(root.data);
        }
        if(level>1){
            InnerNode(root.left,level-1,levelNode);
            InnerNode(root.right,level-1,levelNode);
            
        }
       return;
    }
    
    
    // Func to find the height of the tree
    static int height(Node root){
        if(root==null)return 0;
       return Math.max (height(root.left),height(root.right))+1;
    }
    
}
//GFG QUESTION
