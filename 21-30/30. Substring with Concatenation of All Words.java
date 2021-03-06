class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList<Integer>();
        int length = words[0].length();
        int size = words.length;
        HashMap<String, Integer> map = new HashMap<>();
        constructMap(map, words);
        int containWord = 0;
        int skip = 0;
        for (int i = 0; i <= s.length() - length; i += skip) {
            String word = s.substring(i, i + length);
            if (map.containsKey(word)) {
                containWord++;
                int value = map.get(word) - 1;
                if (value == 0) map.remove(word);
                else map.replace(word, value);
                skip = length;
                if (map.isEmpty()) {
                    answer.add(i+length-size*length);
                    if (i == s.length() - length) break;
                    constructMap(map, words);
                    skip = length-size*length + 1;
                    containWord = 0;
                }
                continue;
            }
            if (containWord > 0) {
                map.clear();
                constructMap(map, words);
                skip = -length*containWord + 1;
                containWord = 0;
                continue;
            }
            skip = 1;
        }
        return answer;
    }
    
    private void constructMap(HashMap<String, Integer> map, String[] words){
        for (int i = 0; i < words.length; i++) {
            int value = 0;
            if (map.containsKey(words[i])) value = map.get(words[i]);
            map.put(words[i], value+1);
        }
    }
    
}
