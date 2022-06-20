//Runtime: 0 ms, faster than 100.00% of Java online submissions for Find First and Last Position of Element in Sorted Array.
//Memory Usage: 47 MB, less than 57.42% of Java online submissions for Find First and Last Position of Element in Sorted Array.
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = {-1,-1};
        if (nums.length == 0) return answer;
        int begin = 0;
        int end = nums.length - 1;
        int middle = 0;
        while(begin <= end){
            middle = (end + begin)/2;
            if (nums[middle] > target)  end = middle - 1;
            else if (nums[middle] < target) begin = middle + 1;
            else break;
        }
        if (begin > end) return answer;
        int first = begin;
        int last = middle;
        int mid = (first + last)/ 2;
        while (first <= last) {
            mid = (first + last)/2;
            if (nums[mid] < target) {
                if (nums[mid+1] == target) {
                    answer[0] = mid+1;
                    break;
                } 
                else first = mid+1;
            }
            else {
                if (mid != 0) {
                    if (nums[mid-1] != target) {
                    answer[0] = mid;
                    break;
                    } 
                }
                last = mid-1;
            }
        }
        first = middle;
        last = end;
       
        while (first <= last) {
            mid = (first + last)/2;
            if (nums[mid] > target) {
                if (nums[mid-1] == target) {
                    answer[1] = mid-1;
                    break;
                } 
                else last = mid-1;
            }
            else {
                if (mid != nums.length - 1) {
                    if (nums[mid+1] != target) {
                    answer[1] = mid;
                    break;
                    } 
                }
                first = mid+1;
            }
        }
        if (nums[begin] == target) answer[0] = begin;
        if (nums[end] == target) answer[1] = end;
        return answer;
    }
}
