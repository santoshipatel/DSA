class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        for (int e : nums) max = Math.max(e, max);

        long cnt = 0;   
        HashMap<Integer, Integer> hm = new HashMap<>();
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);

            while (hm.getOrDefault(max, 0) >= k) {
                hm.put(nums[j], hm.get(nums[j]) - 1);

                if (hm.get(nums[j]) == 0)
                    hm.remove(nums[j]);

                j++;
            }

            cnt += j;   
        }

        return cnt;
    }
}
    