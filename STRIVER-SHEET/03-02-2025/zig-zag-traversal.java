
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//  Approach :
//  1) First we will make a level order traversal 
//  2) then add in the List Integer levelNoddes 
//  3) if in main funtion level/i==even use collections.reverse
 

// new Collection used just to reverse the order 


class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     int h=height(root);
     List<List<Integer>> result=new ArrayList<>();
     for(int i=1;i<=h;i++){
        List<Integer> levelNode=new ArrayList<>();
        InnerNode(root,i,levelNode);

        if(i%2==0){
           Collections.reverse(levelNode);  // Reverse the list in place
          result.add(levelNode);    
        }
        else{
            result.add(levelNode);
        }
     }
    return result;    
 }
   //func to get nodes value at each level


    static void InnerNode(TreeNode root,int level,List<Integer>levelNodes){
        if(root==null)return ;
        if(level==1){
            levelNodes.add(root.val);

        }
        if(level>1){
           InnerNode(root.left,level-1,levelNodes);
             InnerNode(root.right,level-1,levelNodes);
        }
        
        
    }
    //func to get the height 
    static int height(TreeNode root){
        if(root==null)return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
}