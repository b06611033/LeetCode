class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        double answer = 1;
        if (n > 0) {
            while(n > 0) {
                if (n%2 == 1) answer *= x;
                n = n/2;
                x *= x;
            }
        }
        else {
            if (n == -2147483648) {
                n = n/2;
                x *= x;
                n = -n;
            }
            else n = -n;
            while(n > 0) {
                if (n%2 == 1) answer = answer/x;
                n = n/2;
                x *= x;
            }
        }
        return answer;
    }
}
