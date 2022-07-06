//Runtime: 0 ms, faster than 100.00% of Java online submissions for Kth Smallest Element in a BST.
//Memory Usage: 44.5 MB, less than 81.28% of Java online submissions for Kth Smallest Element in a BST.
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
    int count;
    int answer;
    public int kthSmallest(TreeNode root, int k) {
        count = 0;
        answer = 0;
        inorder(root, k);
        return answer;
    }
    private boolean inorder(TreeNode n, int k) {
        if (n == null) return false;
        if (inorder(n.left, k)) return true;
        count++;
        if (count == k) {
            answer = n.val;
            return true;
        }
        if (inorder(n.right, k)) return true;
        return false;
    }
}
