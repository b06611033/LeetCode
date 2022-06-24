//Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Level Order Traversal.
//Memory Usage: 42.8 MB, less than 79.76% of Java online submissions for Binary Tree Level Order Traversal.
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        traverse(root, 1, answer);
        return answer;
    }
    private void traverse(TreeNode n, int level, List<List<Integer>> list) {
        if (n == null) return;
        if (list.size() < level) {
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(n.val);
            list.add(temp);
        }
        else {
            list.get(level - 1).add(n.val);
        }
        traverse(n.left, level + 1, list);
        traverse(n.right, level + 1, list);
        return;
    }
}
