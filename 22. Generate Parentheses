// will satisfy as long as right parenthesis does not exceed left at any time
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<String>();
        String first = new String();
        answer.add(first);
        for (int i = 0; i < n*2; i++) {
            int size = answer.size();
            for (int k = 0; k < size; k++) {
                String s = answer.get(k);
                answer.remove(k);
                int left = 0;
                int right = 0;
                int insertPoint = k;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '(') left++;
                    else right++;
                }
                if (left < n) {
                    String news = new String();
                    news = s;
                    news += '(';
                    answer.add(k, news);
                    insertPoint = answer.size();
                }
                if (right < left) {
                    s += ')';
                    answer.add(insertPoint, s);
                }
            }
        }
        return answer;      
    }
}
