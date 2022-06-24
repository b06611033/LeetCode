//Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
//Memory Usage: 41.4 MB, less than 56.97% of Java online submissions for Same Tree.
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
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        return traverse(p, q);
    }
    private boolean traverse(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if ((p == null && q != null) || (p != null && q == null)) return false;
        if (p.val == q.val) {
            if (!traverse(p.left, q.left)) return false;
            if (!traverse(p.right, q.right)) return false;
        }
        else return false;
        return true;
    } 
}
