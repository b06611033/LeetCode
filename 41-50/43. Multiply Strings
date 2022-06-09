class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        StringBuilder answer = new StringBuilder();
        List<String> list = new ArrayList<String>();
        for (int i = num2.length() - 1; i >= 0; i--) {
            StringBuilder subAnswer = new StringBuilder();
            List<String> subList = new ArrayList<String>();
            for (int j = num1.length() - 1; j >= 0; j--) {
                int val = (num2.charAt(i) - '0') * (num1.charAt(j) - '0');
                subList.add(String.valueOf(val));
            }
            addDigits(subAnswer, subList);
            list.add(subAnswer.toString());
        }
        addDigits(answer, list);
        return answer.toString();
    }
    private void addDigits(StringBuilder sb, List<String> l) {
        List<List<Integer>> digitList = new ArrayList<List<Integer>>();
        for (int i = 0; i <= 400; i++) {
            List<Integer> sameDigit = new ArrayList<Integer>();
            digitList.add(sameDigit);
        }
        for (int i = 0; i < l.size(); i++) {
            String s = l.get(i);
            int digit = 0;
            for (int j = s.length() - 1; j >= 0; j--) {
                List<Integer> temp = new ArrayList<Integer>();
                temp = digitList.get(i+digit);
                temp.add(Character.getNumericValue(s.charAt(j)));
                digit++;
            }
        }
        for (int i = 0; i < digitList.size(); i++) {
            List<Integer> temp = new ArrayList<Integer>();
            temp = digitList.get(i);
            int sum = 0;
            if (!temp.isEmpty()) {
                for (int j: temp) {
                    sum += j;
                }
                if (sum >= 10) {
                    List<Integer> temp2 = new ArrayList<Integer>();
                    temp2 = digitList.get(i+1);
                    temp2.add(sum/10);
                }
                sb.append((char)(sum%10 + '0'));
            }
        }
        sb.reverse();
    }
}
