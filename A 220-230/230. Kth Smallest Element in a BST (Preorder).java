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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<Integer>();
        dfs(root, list);
        Collections.sort(list);
        return list.get(k-1);
    }
    private void dfs(TreeNode n, List<Integer> list) {
        if (n == null) return;
        list.add(n.val);
        dfs(n.left, list);
        dfs(n.right, list);
        return;
    }
}
