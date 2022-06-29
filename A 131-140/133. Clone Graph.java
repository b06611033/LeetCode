//Runtime: 29 ms, faster than 81.53% of Java online submissions for Clone Graph.
//Memory Usage: 42.7 MB, less than 81.07% of Java online submissions for Clone Graph.
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    int[] track = new int[101]; // track how many neighbors added
    HashMap<Integer, Node> map = new HashMap<>(); // map to store cloned nodes
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Node answer = new Node();
        return clone(node, answer);
    }
    private Node clone(Node original, Node cloned) {
        cloned.val = original.val;
        map.put( cloned.val, cloned);
        if (track[original.val] == original.neighbors.size()) return cloned; // all neighbors cloned
        // clone neighbors
        List<Node> list;
        // if neighbor list doesn't exist, create new one
        if (track[original.val] == 0) list = new ArrayList<>();
        // else get the existed list
        else list = new ArrayList<>(map.get(original.val).neighbors);
        // add neighbors that haven't been added to list
        for(int i = track[original.val]; i < original.neighbors.size(); i++) {
            // if neighbor node hasn't been cloned, create new node
            if (track[original.neighbors.get(i).val] == 0) {
                Node neighbor = new Node();
                track[original.val]++;
                list.add(clone(original.neighbors.get(i), neighbor));
            }  
            // else get the existing cloned node, and add as neighbor
            else {
                track[original.val]++;
                list.add(clone(original.neighbors.get(i), map.get(original.neighbors.get(i).val)));
            }          
        }
        cloned.neighbors = list;
        return cloned;
    }

}
