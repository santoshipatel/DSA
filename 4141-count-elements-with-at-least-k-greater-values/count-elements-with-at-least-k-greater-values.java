import java.util.Arrays;

class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        if (k == 0) {
            return n;
        }
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
        if (nums[n - k] > nums[i]) {
                count++;
            }
        }
        return count;  
    }
}