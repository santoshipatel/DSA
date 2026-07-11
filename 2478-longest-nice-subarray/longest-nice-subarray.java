class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = 1;
        int left = 0;
        int curr = 0;
        for(int right=0; right<n; right++){
            while((curr & nums[right]) != 0){   //shrink
                curr = curr ^ nums[left];   //left element ki bits ko curr se remove
                left++;
            }
            curr = curr | nums[right];   //expand(0 | 0 = 0)
            maxLen = Math.max(maxLen , right-left+1);   //update
        }
        return maxLen;
    }
}