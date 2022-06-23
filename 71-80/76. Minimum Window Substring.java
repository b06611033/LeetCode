//Runtime: 21 ms, faster than 52.58% of Java online submissions for Minimum Window Substring.
//Memory Usage: 46.6 MB, less than 45.72% of Java online submissions for Minimum Window Substring.
class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        boolean hasAnswer = false;
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            int count = tMap.getOrDefault(t.charAt(i), 0);
            tMap.put(t.charAt(i), count+1);
        }
        int formed = 0; // to check if a window is formed
        HashMap<Character, Integer> sMap = new HashMap<>();
        int leftP = 0;
        for (int i = 0; i < s.length(); i++) {
            if (tMap.containsKey(s.charAt(i))) {  // only put char that are in string t to the map
                int count = sMap.getOrDefault(s.charAt(i), 0);
                sMap.put(s.charAt(i), count+1);
                if (count+1 == tMap.get(s.charAt(i))) formed++; // if number of same char is matched with that of string t
            }
            if (formed == tMap.size()) hasAnswer = true;
            while (formed == tMap.size() && leftP <= i) {  // if a window containing t is still formed
                if ((i - leftP < right - left) || (right - left == 0)) {  // update the answer if needed
                    left = leftP;
                    right = i;
                }
                int count = sMap.getOrDefault(s.charAt(leftP), 0) - 1;
                if (count == -1) {   // if the char is not in map, ignore it and shrink the window
                    leftP++;
                    continue;
                } 
                sMap.put(s.charAt(leftP), count);
                if (count < tMap.getOrDefault(s.charAt(leftP), 0)) formed--;
                leftP++;
            }
        }
        if (!hasAnswer) return "";
        return s.substring(left,right + 1);
    }
}
