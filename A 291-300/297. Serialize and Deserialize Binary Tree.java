//Runtime: 35 ms, faster than 32.08% of Java online submissions for Serialize and Deserialize Binary Tree.
//Memory Usage: 44.7 MB, less than 88.33% of Java online submissions for Serialize and Deserialize Binary Tree.
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "null";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        sb.append(String.valueOf(root.val));
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.left == null) sb.append(",null");
            else {
                q.add(node.left);
                sb.append("," + String.valueOf(node.left.val));
            }
            if (node.right == null) sb.append(",null");
            else {
                q.add(node.right);
                sb.append("," + String.valueOf(node.right.val));
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("null")) return null;
        TreeNode root = new TreeNode();
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> parentq = new LinkedList<>();
        q.add(root);
        parentq.add(root);
        int position = 0;
        boolean even = true;
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            if (even) even = false;
            else even = true;
            TreeNode parent = parentq.poll();
            String s = new String();
            for (int i = position; i < data.length(); i++) {
                if (data.charAt(i) != ',')  s += data.charAt(i);
                else if (data.charAt(i) == ','){
                    position = i+1;
                    break;
                } 
            }
            if (!even && s.equals("null")) {
                parent.right = null;
            } 
            else if (even && s.equals("null")) {
                parent.left = null;
            }
            else {
                int value = Integer.parseInt(s);
                node.val = value;
                TreeNode left = new TreeNode();
                node.left = left;
                q.add(left);
                parentq.add(node);
                TreeNode right = new TreeNode();
                node.right = right;
                q.add(right);
                parentq.add(node);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
