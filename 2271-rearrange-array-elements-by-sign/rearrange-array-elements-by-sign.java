class Solution {
    public int[] rearrangeArray(int[] nums) {
        // two pointer 
        int n = nums.length;
        int[] result = new int[n];
        
        // Pointer for the next positive element's position 
        int posIndex = 0;
        // Pointer for the next negative element's position 
        int negIndex = 1;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[posIndex] = nums[i];
                posIndex += 2; // Move to the next even index
            } else {
                result[negIndex] = nums[i];
                negIndex += 2; // Move to the next odd index
            }
        }
        
        return result;
    }
}