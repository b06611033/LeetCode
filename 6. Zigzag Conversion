//Runtime: 10 ms, faster than 66.86% of Java online submissions for Zigzag Conversion.
//Memory Usage: 42.5 MB, less than 93.35% of Java online submissions for Zigzag Conversion.
class Solution {
    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) return s;
        String answer = new String();
        int groupSize = numRows + (numRows - 2); // the size of a zigzag group
        StringBuilder[] rowString = new StringBuilder[numRows];// for constant concatenation
        for (int i = 0; i < numRows; i++) {
            rowString[i] = new StringBuilder();
        }
        for (int  i = 0; i < s.length(); i++) {
            int remainder = 0;
            if (i % groupSize > numRows - 1) remainder = groupSize - i % groupSize;
            else remainder = i % groupSize;
            rowString[remainder].append(s.charAt(i));
        }
        for (int i = 0; i < numRows; i++) {
            answer =  answer + rowString[i].toString();
        }
        return answer;
    }
}
