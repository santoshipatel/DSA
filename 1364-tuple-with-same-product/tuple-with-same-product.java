class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans=0;
        for( int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int p=nums[i]*nums[j];
                hm.put(p , hm.getOrDefault(p,0)+1);
            }
        }
             for (int freq : hm.values()) {
            if (freq >= 2) {
                ans += (freq * (freq - 1) / 2) * 8;
            }
        }

        return ans;
    }
}