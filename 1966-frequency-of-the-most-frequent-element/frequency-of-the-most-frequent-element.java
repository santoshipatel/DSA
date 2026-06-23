class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j =0;
        long  ans=0;
        long count=0;
        while( i < nums.length){
            count += nums[i];
            while( nums[i] *( i-j+1.00)  > count+k){
                count =count - nums[j];
                j++;
            }
          ans = Math.max(ans, i - j + 1L);
            i++;
            
        }
        return (int) ans;
    }
}