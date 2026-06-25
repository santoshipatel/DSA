class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int totalSubarrays = 0;
        
        // Check every possible starting position of a subarray
        for (int i = 0; i < n; i++) {
            int targetCount = 0;
            
            // Expand the subarray from i to j
            for (int j = i; j < n; j++) {
                if (nums[j] == target) {
                    targetCount++;
                }
                
                int subarrayLength = j - i + 1;
                if (targetCount > subarrayLength / 2) {
                    totalSubarrays++;
                }
            }
        }
        
        return totalSubarrays;
    }
}