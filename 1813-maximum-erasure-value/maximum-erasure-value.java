class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0;
        int max=0;
        int j=0;
       HashMap<Integer,Integer> hm = new HashMap<>();
       for( int i=0; i<nums.length; i++){
        hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);

        // if(hm.size()== j-i+1){
        //     sum=sum+nums[i];
        //     max=Math.max(sum , 0);
        // }
        if(hm.size() < i-j+1){
            while(hm.size() < i-j+1){
                  hm.put(nums[j], hm.getOrDefault(nums[j],0)-1);
                  sum=sum-nums[j];
                  if(hm.get(nums[j]) == 0) {hm.remove(nums[j]);}
                  j++;
            }
        }
         sum=sum+nums[i];
         max=Math.max(sum , max);

       }
return max;

    }
}