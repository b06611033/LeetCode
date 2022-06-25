//Runtime: 0 ms, faster than 100.00% of Java online submissions for Validate Binary Search Tree.
//Memory Usage: 42.4 MB, less than 81.34% of Java online submissions for Validate Binary Search Tree.
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
    boolean metMax = false;
    boolean metMin = false;
    public boolean isValidBST(TreeNode root) {
        return traverse(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    private boolean traverse(TreeNode n, int max, int min) {
        if (n == null) return true;
        if (n.val == Integer.MAX_VALUE && max == Integer.MAX_VALUE && !metMax) metMax = true;
        else if (n.val == Integer.MIN_VALUE && min == Integer.MIN_VALUE && !metMin) metMin =true;
        else if (n.val <= min || n.val >= max) return false;
        return traverse(n.left, n.val, min) && traverse(n.right, max, n.val);
    }
}
