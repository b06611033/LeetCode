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
    int preorderIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        int preIndex = 0;
        return construct(preorder, 0, inorder.length - 1, map);
    }
    private TreeNode construct(int[] preorder, int left, int right, HashMap<Integer, Integer> map) {
        if (left > right) return null;
        int value = preorder[preorderIndex]; // traverse order is same as preorder
        TreeNode newNode = new TreeNode(value);
        preorderIndex++;
        //split inorder array to left subtree and right subtree, the middle element is the root
        newNode.left = construct(preorder, left, map.get(value) - 1, map);
        newNode.right = construct(preorder, map.get(value) + 1, right, map);
        return newNode;
    }

}
