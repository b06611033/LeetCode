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
    int answer = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        pathSum(root);
        return answer;
    }
    private int pathSum(TreeNode n) {
        if (n == null) return 0;
        int left = Math.max(0, pathSum(n.left));
        int right = Math.max(0, pathSum(n.right));
        if (left + right + n.val > answer) answer = left + right + n.val;
        return Math.max(left, right) + n.val;
    }
}
