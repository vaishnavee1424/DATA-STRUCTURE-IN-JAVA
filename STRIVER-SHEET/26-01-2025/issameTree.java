class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        // If only one tree is empty, they are not identical
        if (p == null || q == null || p.val != q.val)
            return false;

        // Check if the root data is the same and
        // recursively check for the left and right subtrees

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}