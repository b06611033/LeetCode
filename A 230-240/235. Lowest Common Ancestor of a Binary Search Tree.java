//Runtime: 4 ms, faster than 100.00% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
//Memory Usage: 42.8 MB, less than 98.45% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // find p
        TreeNode node = root;
        List<TreeNode> listp = new ArrayList<TreeNode>();
        while (node.val != p.val) {
            listp.add(node);
            if (node.val == q.val) return node;
            else if (node.val > p.val) node = node.left;
            else node = node.right;
        }
        //find q
        List<TreeNode> listq = new ArrayList<TreeNode>();
        node = root;
        while (node.val != q.val) {
            listq.add(node);
            if (node.val == p.val) return node;
            else if (node.val > q.val) node = node.left;
            else node = node.right;
        }
        for (int i = listp.size()-1; i >= 0; i--) {
             TreeNode temp = listp.get(i); 
             for (int j = listq.size()-1; j >= 0; j--) {
                   if (temp == listq.get(j)) return temp;
             }
        }
        return null;
    }
}
