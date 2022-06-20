//Runtime: 4 ms, faster than 97.33% of Java online submissions for Integer to Roman.
//Memory Usage: 41.7 MB, less than 97.45% of Java online submissions for Integer to Roman.
import java.util.Stack;  
class Solution {
    public String intToRoman(int num) {
        StringBuilder answer = new StringBuilder();
        int thousand = num/1000;
        int hundred = (num%1000)/100;
        int ten = (num%100)/10;
        int digit = num%10;
        if (thousand == 0) answer.append("");
        else if (thousand == 1) answer.append("M");
        else if (thousand == 2) answer.append("MM");
        else if (thousand == 3) answer.append("MMM");
        if (hundred == 0) answer.append("");
        else if (hundred == 1) answer.append("C");
        else if (hundred == 2) answer.append("CC");
        else if (hundred == 3) answer.append("CCC");
        else if (hundred == 4) answer.append("CD");
        else if (hundred == 5) answer.append("D");
        else if (hundred == 6) answer.append("DC");
        else if (hundred == 7) answer.append("DCC");
        else if (hundred == 8) answer.append("DCCC");
        else if (hundred == 9) answer.append("CM");
        if (ten == 0) answer.append("");
        else if (ten == 1) answer.append("X");
        else if (ten == 2) answer.append("XX");
        else if (ten == 3) answer.append("XXX");
        else if (ten == 4) answer.append("XL");
        else if (ten == 5) answer.append("L");
        else if (ten == 6) answer.append("LX");
        else if (ten == 7) answer.append("LXX");
        else if (ten == 8) answer.append("LXXX");
        else if (ten == 9) answer.append("XC");
        if (digit == 0) answer.append("");
        else if (digit == 1) answer.append("I");
        else if (digit == 2) answer.append("II");
        else if (digit == 3) answer.append("III");
        else if (digit == 4) answer.append("IV");
        else if (digit == 5) answer.append("V");
        else if (digit == 6) answer.append("VI");
        else if (digit == 7) answer.append("VII");
        else if (digit == 8) answer.append("VIII");
        else if (digit == 9) answer.append("IX");
            
        return answer.toString();
    }
}
