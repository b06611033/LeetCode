// will satisfy as long as right parenthesis does not exceed left at any time
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<String>();
        generator(answer, 1, 0, "(", n);
        return answer;      
    }
    private void generator (List<String> list, int left, int right, String s, int pairNum) {
        if (left == pairNum && right == pairNum) {
            list.add(s);
            return;
        }
        if (left < pairNum) {
            generator(list, left + 1, right, s + "(", pairNum);
        }
        if (right < left) {
            generator(list, left, right + 1, s + ")", pairNum);
        }
    }   
}
