//Runtime: 1 ms, faster than 99.39% of Java online submissions for Reverse Integer.
//Memory Usage: 39.4 MB, less than 94.65% of Java online submissions for Reverse Integer.//
import java.lang.Math;
class Solution {
    public int reverse(int x) {
        int answer = 0;
        int absolute = Math.abs(x);
        while (absolute > 0) {
            int previous = answer;
            int last = absolute%10;
            answer = answer*10 + last;
            if ((answer - last)/10 != previous) return 0;
            absolute = absolute/10;
        }
        if (x < 0) answer = 0 - answer;
        return answer;
    }
}
