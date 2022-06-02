//Runtime: 4 ms, faster than 68.49% of Java online submissions for Two Sum.
//Memory Usage: 42.2 MB, less than 95.87% of Java online submissions for Two Sum.
import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target){
        int[] copy = new int[nums.length]; // copy of original array
        for (int i = 0; i < nums.length; i++) {
            copy[i] = nums[i];
        }
        int[] ans = new int[2];
        int num1 = 0;
        int num2 = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
         int remaining = target - nums[i];
         int secPosition = binarySearch(nums,remaining,i);
         if (secPosition != -1){
                num1 = nums[i];
                num2 = nums[secPosition];
                break;
         }
        }
        boolean assigned = false; // track if num1 is assigned
        for (int i = 0; i < copy.length;i++) {
            if (!assigned && num1 == copy[i]) {
                ans[0] = i;
                assigned = true;
            } 
            else if(num2 == copy[i]) ans[1] = i;
            else continue;
        }
        return ans;
    }
    public int binarySearch(int[] a, int target,int firPosition)  {
        int end = a.length - 1;
        int start = firPosition + 1;
        int mid;
        while(start <= end) {
        mid = (end + start)/2;
        if (a[mid] < target) {
            start = mid + 1;
        } 
        else if (a[mid] > target) {
            end = mid - 1;  
        } 
        else return mid;
        }
        return -1;
    }  

}
