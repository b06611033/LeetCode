//Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
//Memory Usage: 42.9 MB, less than 67.38% of Java online submissions for Maximum Depth of Binary Tree.
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
    int largest = 0;
    public int maxDepth(TreeNode root) {
        traverse(root, 1);
        return largest;
    }
    public void traverse(TreeNode n, int level) {
        if (n == null) return;
        if (level > largest) largest = level;
        traverse(n.left, level + 1);
        traverse(n.right, level + 1);
        return;
    }
}
