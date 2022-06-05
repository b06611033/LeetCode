//Runtime: 0 ms, faster than 100.00% of Java online submissions for Next Permutation.
//Memory Usage: 42.7 MB, less than 82.05% of Java online submissions for Next Permutation.
class Solution {
    public void nextPermutation(int[] nums) {
        int front = 0;
        int back = 0;
        boolean found = false;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i-1]) {
                front = i - 1;
                found = true;
                break;
            }
        }
        if (found) {
            for (int j = nums.length - 1; j > front; j--) {
               if (nums[j] > nums[front]) {
                 back = j;
                 break;
               }
            }
            int temp = nums[front];
            nums[front] = nums[back];
            nums[back] = temp;
            reverse(nums, front + 1);
        }
        else reverse(nums, 0);
    }
    private void reverse(int[] nums, int start) {
        int left = start;
        int right = nums.length - 1;
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
