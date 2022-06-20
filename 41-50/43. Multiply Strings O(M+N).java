class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        StringBuilder answer = new StringBuilder();
        StringBuilder first = new StringBuilder(num1);
        StringBuilder second = new StringBuilder(num2);
        first.reverse();
        second.reverse();
         for (int i = 0; i < num1.length() + num2.length(); i++) {
            answer.append(0);
        }
        for (int i = 0; i < num2.length(); i++) {
            for (int j = 0; j < num1.length(); j++) {
                int product = (second.charAt(i) - '0') * (first.charAt(j) - '0');
                int currentVal = answer.charAt(i + j) - '0';
                int newVal = currentVal + product;
                answer.setCharAt(i+j, (char)(newVal%10 + '0'));
                int next = answer.charAt(i + j + 1) - '0';
                answer.setCharAt(i+j+1, (char)(newVal/10 + next + '0'));
            }
        }
        for (int i = answer.length() - 1; i >= 0; i--) {
            if (answer.charAt(i) == '0') answer.deleteCharAt(i);
            else break;
        }
        answer.reverse();
        return answer.toString();
    }   
}
