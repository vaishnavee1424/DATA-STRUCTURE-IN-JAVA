//kuch logic confusion hai abhi  bhi dekhte hai isko bhi 
class Solution {
    public boolean isSymmetric(TreeNode root) {
       if(root==null)return true;
      return Symmetric(root.left ,root.right) ;
    }
    static boolean Symmetric(TreeNode left,TreeNode right){
        if(left ==null && right==null )return true;
        if( left == null || right==null|| left.val!=right.val)return false;
         return Symmetric(left.left ,right.right) && Symmetric(left.right ,right.left);
    }
    }