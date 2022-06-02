class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<String>();
        if (digits.length() == 0) return answer;
        answer.add("");
        for (int i = 0; i < digits.length(); i++) {
            int listSize = answer.size();
            if (digits.charAt(i) == '2') {
                for (int j = 0; j < listSize; j++) {
                    String copy = answer.remove(j);
                    answer.add(j, copy + "a");
                    answer.add(copy + "b");
                    answer.add(copy + "c");
                }
            }
            else if (digits.charAt(i) == '3') {
                 for (int j = 0; j < listSize; j++) {
                    String copy = answer.remove(j);
                    answer.add(j, copy + "d");
                    answer.add(copy + "e");
                    answer.add(copy + "f");
                }
            }
            else if (digits.charAt(i) == '4') {
                 for (int j = 0; j < listSize; j++) {
                    String copy = answer.remove(j);
                    answer.add(j, copy + "g");
                    answer.add(copy + "h");
                    answer.add(copy + "i");
                 }
            }
            else if (digits.charAt(i) == '5') {
                 for (int j = 0; j < listSize; j++) {
                    String copy = answer.remove(j);
                    answer.add(j, copy + "j");
                    answer.add(copy + "k");
                    answer.add(copy + "l");
                 }
            }
            else if (digits.charAt(i) == '6') {
                 for (int j = 0; j < listSize; j++) {
                    String copy = answer.remove(j);
                    answer.add(j, copy + "m");
                    answer.add(copy + "n");
                    answer.add(copy + "o");
                 }
            }
            else if (digits.charAt(i) == '7') {
                  for (int j = 0; j < listSize; j++) {
                    String copy = answer.remove(j);
                    answer.add(j, copy + "p");
                    answer.add(copy + "q");
                    answer.add(copy + "r");
                    answer.add(copy + "s");
                 }
            }
            else if (digits.charAt(i) == '8') {
                  for (int j = 0; j < listSize; j++) {
                    String copy = answer.remove(j);
                    answer.add(j, copy + "t");
                    answer.add(copy + "u");
                    answer.add(copy + "v");
                 }
            }
            else  {
                  for (int j = 0; j < listSize; j++) {
                    String copy = answer.remove(j);
                    answer.add(j, copy + "w");
                    answer.add(copy + "x");
                    answer.add(copy + "y");
                    answer.add(copy + "z");
                 }
            }
        }
        return answer;
    }
}
