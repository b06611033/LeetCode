//Runtime: 5 ms, faster than 88.83% of Java online submissions for Longest Substring Without Repeating Characters.
//Memory Usage: 42.1 MB, less than 95.31% of Java online submissions for Longest Substring Without Repeating Characters.
import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // key is the character ascii, value is the character position in the string
        int largest = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            int key = s.charAt(i);
            if (!map.containsKey(key)) {
                map.put(key,i);
                largest = Math.max(i - start + 1, largest); 
            } 
            else {
                int position = map.get(key); // position of the last char which is repeated
                start = Math.max(position + 1, start); 
                largest = Math.max(i - start + 1, largest); 
                map.put(key,i);
            }
        }
        return largest;
    }
}
