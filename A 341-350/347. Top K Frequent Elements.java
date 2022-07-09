//Runtime: 11 ms, faster than 92.62% of Java online submissions for Top K Frequent Elements.
//Memory Usage: 44.4 MB, less than 99.69% of Java online submissions for Top K Frequent Elements.
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number: nums) {
            map.put(number, map.getOrDefault(number, 0)+1);
        }
        int[][] arr = new int[map.size()][2];
        int count = 0;
        for (int number: nums) {
            if (!map.containsKey(number)) continue;
            else {
                 arr[count][0] = number;
                 arr[count][1] = map.get(number);
                 map.remove(number);
                 count++;
            }
        }
        Arrays.sort(arr, new ArrayComparator());
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i][0] == arr[i-1][0]) continue;
            else {
                answer[count] = arr[i][0];
                count++;
            }
            if (count == k) break;
        }
        return answer;
    }
}
class ArrayComparator implements Comparator<int[]> {
    public int compare(int[] a1, int[] a2) {
        return Integer.compare(a2[1], a1[1]);
    }
}
