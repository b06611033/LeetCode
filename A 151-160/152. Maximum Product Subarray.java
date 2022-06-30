class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1 && nums[0] == 0) return 0;
        int largest = Integer.MIN_VALUE;
        List<Integer> negative = new ArrayList<Integer>();
        List<Integer> zero = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) negative.add(i);
            else if (nums[i] == 0) zero.add(i);
        }
        if (zero.size() > 0) largest = 0;
        int lastzeroPos = -1;
        int product1 = 1;
        int product2 = 1;
        for (int i = 0; i < zero.size(); i++) {
            int zeroPos = zero.get(i);
            List<Integer> negativePos = new ArrayList<Integer>();
            for (Integer num: negative) {
                if (num < zeroPos && num > lastzeroPos) negativePos.add(num);
            }
            if (negativePos.size()%2 == 0) {
                if (lastzeroPos == zeroPos - 1 && nums[zeroPos] == 0) {
                    product1 = 0;
                    product2 = 0;
                }
                for (int j = lastzeroPos + 1; j < zeroPos; j++) {
                    product1 = product1*nums[j];
                }
                if (product1 > largest) largest = product1;
            }
            else {
                int firstNegative = negativePos.get(0);
                int lastNegative = negativePos.get(negativePos.size() - 1);
                if (firstNegative == lastNegative && lastzeroPos + 1 == zeroPos - 1) {
                    product1 = nums[firstNegative]; 
                    product2 = nums[firstNegative]; 
                } 
                for (int j = lastzeroPos + 1; j < lastNegative; j++) {
                    product1 = product1*nums[j];
                }
                for (int j = firstNegative + 1; j < zeroPos; j++) {
                    product2 = product2*nums[j];
                }
                if (Math.max(product1, product2) > largest) largest = Math.max(product1, product2);
            }
            lastzeroPos = zeroPos;
            product1 = 1;
            product2 = 1;
        }
        List<Integer> last = new ArrayList<Integer>();
        for (Integer num: negative) {
                if (num > lastzeroPos) last.add(num);
        }
        if (last.size()%2 == 0) {
                if (lastzeroPos == nums.length - 1 && nums[nums.length-1] == 0) {
                    product1 = 0;
                    product2 = 0;
                }
                for (int j = lastzeroPos + 1; j < nums.length; j++) {
                    product1 = product1*nums[j];
                }
                if (product1 > largest) largest = product1;
        }
        else {
                int firstNegative = last.get(0);
                int lastNegative = last.get(last.size() - 1);
                if (firstNegative == lastNegative && lastzeroPos+1 == nums.length-1) {
                    product1 = nums[firstNegative];
                    product2 = nums[firstNegative];
                } 
                for (int j = lastzeroPos + 1; j < lastNegative; j++) {
                    product1 = product1*nums[j];
                }
                for (int j = firstNegative + 1; j < nums.length; j++) {
                    product2 = product2*nums[j];
                }
                if (Math.max(product1, product2) > largest) largest = Math.max(product1, product2);
        }
        return largest;
    }
}
