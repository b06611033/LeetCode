//Runtime: 2 ms, faster than 87.25% of Java online submissions for Product of Array Except Self.
//Memory Usage: 57.6 MB, less than 60.03% of Java online submissions for Product of Array Except Self.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] beforeProduct = new int[nums.length];
        int[] afterProduct = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            beforeProduct[i] = product;
            product = product*nums[i];
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            afterProduct[i] = product;
            product = product*nums[i];
        }
         for (int i = 0; i < nums.length; i++) {
            answer[i] = beforeProduct[i]*afterProduct[i];
        }
        return answer;
    }
}
