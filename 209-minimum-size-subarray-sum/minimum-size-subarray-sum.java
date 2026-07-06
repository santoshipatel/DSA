class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int currsum = 0;
        int window  = Integer.MAX_VALUE;
        for(int right = 0; right<n; right++){
            currsum = currsum + nums[right];  // expand 
            while(currsum >= target){
                 // update the window 
                 window = Math.min(window,right-left+1);
                 currsum = currsum- nums[left];
                 left++;
                 
                 
            }
        }
        if(window == Integer.MAX_VALUE) return 0;
        return window;
        
    }
}