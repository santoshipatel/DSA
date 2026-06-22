class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        List<Integer> li = new ArrayList<>();
        // if(n == 0) return li;
        int[] rightMax = new int[n];
        rightMax[n-1]  = Integer.MIN_VALUE;
        for(int i=n-2; i>= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], nums[i+1]);
        }
        int leftMax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(i == 0 || i == n-1)  li.add(nums[i]);
            else{
                if(nums[i] > leftMax || nums[i] > rightMax[i]) li.add(nums[i]);
            }
             leftMax = Math.max(leftMax, nums[i]);
        }
        return li;
    
    }
}