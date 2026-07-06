class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int currpro = 1;
        int count = 0;
        for(int right = 0; right<n; right++){
            currpro = currpro * nums[right];
            while(currpro >= k){
                currpro = currpro / nums[left];
                left++;
            }
            count = count + (right-left+1);
    }
    
    return count;
}
}